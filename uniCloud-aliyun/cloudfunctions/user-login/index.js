'use strict';
exports.main = async (event, context) => {
  const { username, password } = event;

  if (!username || !password) {
    return {
      errCode: 400,
      errMsg: '用户名和密码不能为空'
    };
  }

  try {
    // 查询用户信息
    const db = uniCloud.database();
    const collection = db.collection('uni-id-users');

    // 在实际应用中，密码应该加密存储
    const result = await collection.where({
      username: username,
      password: password // 注意：实际应用中应使用加密密码对比
    }).get();

    if (result.data.length === 0) {
      return {
        errCode: 401,
        errMsg: '用户名或密码错误'
      };
    }

    const user = result.data[0];

    // 生成token（简化版，实际应使用更安全的方式）
    const token = generateToken(user._id);

    // 更新用户最后登录时间
    await collection.doc(user._id).update({
      last_login_date: Date.now()
    });

    return {
      errCode: 0,
      errMsg: '登录成功',
      data: {
        id: user._id,
        username: user.username,
        name: user.name || user.username,
        avatar: user.avatar || '/static/avatar.png',
        role: user.role || '党员',
        organization: user.organization || '数智公司党支部',
        token: token
      }
    };

  } catch (error) {
    console.error('登录失败:', error);
    return {
      errCode: 500,
      errMsg: '登录失败，请稍后重试',
      error: error.message
    };
  }
};

// 简单的token生成函数（实际应用中应使用更安全的方式）
function generateToken(userId) {
  const timestamp = Date.now();
  const random = Math.random().toString(36).substring(2);
  return btoa(`${userId}_${timestamp}_${random}`).replace(/=/g, '');
}