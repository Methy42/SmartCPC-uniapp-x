<template>
  <view class="container">
    <!-- 页面标题 -->
    <view class="page-header">
      <image class="star-icon" src="/static/star.png" mode="widthFix"></image>
      <text class="page-title">支部活动</text>
    </view>

    <!-- 选项卡 -->
    <u-tabs :list="tabList" v-model="activeTab" active-color="#FF8C00" inactive-color="#666" bg-color="#F5F5F5"></u-tabs>

    <!-- 待办活动 -->
    <view class="activity-list" v-if="activeTab === 0">
      <view class="activity-card">
        <text class="activity-title">“廉洁家风”主题党日活动</text>
        <text class="activity-subtitle">清风浸润数智心 廉韵筑牢发展基——数智科技公司廉洁文化宣传教育月活动走深走实</text>
        
        <view class="activity-info">
          <u-icon name="calendar" size="24" color="#666"></u-icon>
          <text class="info-text">会议时间：2025年11月10日 星期三 9:30 ~ 11:30</text>
        </view>
        
        <view class="activity-info">
          <u-icon name="people" size="24" color="#666"></u-icon>
          <text class="info-text">会议组织：数智公司党支部</text>
        </view>
        
        <view class="activity-info">
          <u-icon name="location" size="24" color="#666"></u-icon>
          <text class="info-text">会议地点：311室</text>
        </view>
        
        <view class="btn-group">
          <u-button text="参加" type="primary" size="mini" bg-color="#FF8C00"></u-button>
          <u-button text="请假" type="default" size="mini" border-color="#FF8C00" color="#FF8C00"></u-button>
        </view>
      </view>
    </view>

    <!-- 往期活动 -->
    <view class="activity-list" v-else>
      <view class="activity-card" v-for="(item, index) in historyList" :key="index">
        <text class="activity-title">{{ item.title }}</text>
        <text class="activity-subtitle">{{ item.subtitle }}</text>
        <view class="activity-time">
          <u-icon name="calendar" size="24" color="#666"></u-icon>
          <text class="time-text">{{ item.time }}</text>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup lang="ts">
import { ref } from 'vue'

// 选项卡
const tabList = ref([
  { name: '待办活动' },
  { name: '往期活动' }
])
const activeTab = ref(0)

// 往期活动数据
const historyList = ref([
  {
    title: '党支部主题党日活动（共建）',
    subtitle: '南水北调江苏水源公司赴淮阴区调研乡村振兴工作 慰问驻村干部',
    time: '活动时间：2025年10月23日，时间半天'
  },
  {
    title: '“廉洁家风”主题党日活动',
    subtitle: '清风浸润数智心 廉韵筑牢发展基——数智科技公司廉洁文化宣传教育月活动走深走实',
    time: '活动时间：2025年9月23日，10:30 - 11:30'
  },
  {
    title: '党支部主题党日活动',
    subtitle: '数智科技公司党支部开展“深学讲话凝斗志 砥砺初心强信念”主题党日活动',
    time: '活动时间：2025年9月12日，时间半天'
  }
])
</script>

<style scoped>
/* 样式与三会一课页面基本一致，仅调整部分命名 */
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

.activity-list {
  padding: 20rpx 30rpx;
}

.activity-card {
  background-color: #fff;
  border-radius: 16rpx;
  padding: 30rpx;
  margin-bottom: 20rpx;
}

.activity-title {
  font-size: 32rpx;
  font-weight: bold;
  color: #333;
  margin-bottom: 10rpx;
  display: block;
}

.activity-subtitle {
  font-size: 24rpx;
  color: #666;
  margin-bottom: 20rpx;
  display: block;
  line-height: 1.5;
}

.activity-info, .activity-time {
  display: flex;
  align-items: center;
  margin-bottom: 15rpx;
}

.info-text, .time-text {
  font-size: 28rpx;
  color: #666;
  margin-left: 10rpx;
  flex: 1;
}

.btn-group {
  display: flex;
  justify-content: flex-end;
  gap: 20rpx;
  margin-top: 20rpx;
}
</style>