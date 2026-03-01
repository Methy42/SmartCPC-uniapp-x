<template>
  <view class="container">
    <!-- 页面标题 -->
    <view class="page-header">
      <image class="star-icon" src="/static/star.png" mode="widthFix"></image>
      <text class="page-title">个人中心</text>
    </view>

    <!-- 用户信息 -->
    <view class="user-card">
      <image class="user-avatar" src="/static/avatar.png" mode="aspectFill"></image>
      <view class="user-info">
        <text class="user-name">李邵丽</text>
        <u-tag text="党员" type="danger" size="mini"></u-tag>
        <text class="user-org">所在党组织：数智公司党支部</text>
      </view>
    </view>

    <!-- 功能列表 -->
    <view class="func-list">
      <u-cell-group>
        <u-cell title="个人资料" icon="heart" icon-color="#9370DB" isLink></u-cell>
        <u-cell title="我的参会记录" icon="flag" icon-color="#C8102E" isLink></u-cell>
        <u-cell title="我的活动记录" icon="folder" icon-color="#1E90FF" isLink></u-cell>
        <u-cell title="修改密码" icon="lock" icon-color="#32CD32" isLink></u-cell>
        <u-cell title="系统设置" icon="setting" icon-color="#1E90FF" isLink></u-cell>
        <u-cell title="退出登录" icon="logout" icon-color="#8B4513" isLink></u-cell>
      </u-cell-group>
    </view>
  </view>
</template>

<script setup lang="ts">
// 暂无业务逻辑
</script>

<style scoped>
.container {
  background-color: #F5F5F5;
  min-height: 100vh;
  padding-bottom: 100rpx;
}

.page-header {
  display: flex;
  align-items: center;
  padding: 20rpx 30rpx;
  background-color: #fff;
}

.star-icon {
  width: 40rpx;
  height: 40rpx;
  margin-right: 10rpx;
}

.page-title {
  font-size: 36rpx;
  font-weight: bold;
  color: #333;
}

/* 用户信息 */
.user-card {
  background-color: #fff;
  border-radius: 16rpx;
  margin: 20rpx 30rpx;
  padding: 30rpx;
  display: flex;
  align-items: center;
}

.user-avatar {
  width: 120rpx;
  height: 120rpx;
  border-radius: 50%;
  margin-right: 30rpx;
}

.user-info {
  flex: 1;
}

.user-name {
  font-size: 36rpx;
  font-weight: bold;
  color: #333;
  margin-right: 10rpx;
}

.user-org {
  font-size: 28rpx;
  color: #666;
  margin-top: 10rpx;
  display: block;
}

/* 功能列表 */
.func-list {
  margin: 20rpx 30rpx;
}
</style>