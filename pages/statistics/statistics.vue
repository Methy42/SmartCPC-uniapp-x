<template>
  <view class="container">
    <!-- 页面标题 -->
    <view class="page-header">
      <image class="star-icon" src="/static/star.png" mode="widthFix"></image>
      <text class="page-title">数据看板</text>
      <u-picker mode="selector" :range="yearList" v-model="selectedYear" @change="onYearChange" class="year-picker"></u-picker>
    </view>

    <!-- 核心数据概览 -->
    <view class="data-card">
      <view class="card-header">
        <image class="party-icon" src="/static/party-icon.png" mode="widthFix"></image>
        <text class="card-title">中共南水北调（江苏）数智科技有限公司支部</text>
      </view>
      <view class="data-grid">
        <view class="data-item red">
          <text class="data-num">25名</text>
          <text class="data-label">党员总数</text>
        </view>
        <view class="data-item blue">
          <text class="data-num">38次</text>
          <text class="data-label">三会一课</text>
        </view>
        <view class="data-item purple">
          <text class="data-num">15次</text>
          <text class="data-label">支部活动</text>
        </view>
      </view>
    </view>

    <!-- 三会一课统计 -->
    <view class="chart-card">
      <text class="chart-title">三会一课</text>
      <!-- 柱状图（使用u-charts，需单独安装） -->
      <qiun-data-charts type="column" :opts="columnOpts" :chartData="columnData"></qiun-data-charts>
      
      <!-- 饼图 -->
      <text class="chart-subtitle">组织生活 51次</text>
      <qiun-data-charts type="pie" :opts="pieOpts" :chartData="pieData"></qiun-data-charts>
    </view>

    <!-- 参会率统计 -->
    <view class="rate-card">
      <view class="rate-grid">
        <view class="rate-item" v-for="(item, index) in rateList" :key="index">
          <u-circle-progress :percentage="item.rate" :strokeWidth="10" :color="item.color"></u-circle-progress>
          <text class="rate-num">{{ item.rate }}%</text>
          <text class="rate-text">{{ item.name }}</text>
        </view>
      </view>
    </view>

    <!-- 党建任务清单 -->
    <view class="task-card">
      <text class="task-title">党支部2025年度党建工作任务清单</text>
      <u-table :columns="taskColumns" :data="taskData" border></u-table>
    </view>
  </view>
</template>

<script setup lang="ts">
import { ref } from 'vue'

// 年份选择
const yearList = ref(['2023', '2024', '2025', '2026'])
const selectedYear = ref('2025')
const onYearChange = (val: any) => {
  console.log('选择年份：', val)
}

// 柱状图配置
const columnOpts = ref({
  color: ['#C8102E'],
  padding: [15, 15, 0, 15],
  xAxis: {
    disableGrid: true
  },
  yAxis: {
    min: 0,
    max: 8
  }
})
const columnData = ref({
  categories: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月'],
  series: [{
    name: '开展次数',
    data: [3, 2, 4, 5, 3, 6, 4, 7, 5, 4, 3, 6]
  }]
})

// 饼图配置
const pieOpts = ref({
  color: ['#C8102E', '#FF8C00', '#1E90FF', '#9370DB', '#D3D3D3', '#F0E68C'],
  padding: [15, 15, 0, 15]
})
const pieData = ref({
  series: [
    { name: '支部党员大会', data: 16 },
    { name: '支部委员会', data: 12 },
    { name: '党小组会', data: 10 },
    { name: '党课', data: 8 },
    { name: '理论学习', data: 0 },
    { name: '支部活动', data: 0 }
  ]
})

// 参会率数据
const rateList = ref([
  { rate: 98, name: '支部党员大会 参会率', color: '#C8102E' },
  { rate: 96, name: '支部委员会 参会率', color: '#FF8C00' },
  { rate: 95, name: '党小组会 参会率', color: '#1E90FF' },
  { rate: 95, name: '理论学习 参会率', color: '#9370DB' },
  { rate: 95, name: '党课 参会率', color: '#48D1CC' },
  { rate: 95, name: '支部活动 参会率', color: '#32CD32' }
])

// 任务清单数据
const taskColumns = ref([
  { title: '序号', key: 'id' },
  { title: '任务名称', key: 'name' },
  { title: '完成状态', key: 'status' }
])
const taskData = ref([
  { id: 1, name: '党风廉政建设', status: '进行中' },
  { id: 2, name: '主题党日活动', status: '已完成' },
  { id: 3, name: '党员教育培训', status: '进行中' }
])
</script>

<style scoped>
.container {
  background-color: #F5F5F5;
  min-height: 100vh;
  padding-bottom: 100rpx;
}

/* 页面标题 */
.page-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
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

.year-picker {
  width: 120rpx;
}

/* 数据卡片 */
.data-card {
  background-color: #fff;
  border-radius: 16rpx;
  margin: 20rpx 30rpx;
  padding: 30rpx;
}

.card-header {
  display: flex;
  align-items: center;
  margin-bottom: 30rpx;
}

.party-icon {
  width: 40rpx;
  height: 40rpx;
  margin-right: 10rpx;
}

.card-title {
  font-size: 28rpx;
  color: #333;
}

.data-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 20rpx;
}

.data-item {
  border-radius: 12rpx;
  padding: 20rpx;
  text-align: center;
  color: #fff;
}

.data-item.red {
  background-color: #C8102E;
}

.data-item.blue {
  background-color: #1E90FF;
}

.data-item.purple {
  background-color: #9370DB;
}

.data-num {
  font-size: 36rpx;
  font-weight: bold;
  display: block;
}

.data-label {
  font-size: 24rpx;
  display: block;
  margin-top: 10rpx;
}

/* 图表卡片 */
.chart-card {
  background-color: #fff;
  border-radius: 16rpx;
  margin: 20rpx 30rpx;
  padding: 30rpx;
}

.chart-title {
  font-size: 32rpx;
  font-weight: bold;
  color: #333;
  text-align: center;
  margin-bottom: 20rpx;
  display: block;
}

.chart-subtitle {
  font-size: 28rpx;
  color: #666;
  margin: 20rpx 0;
  display: block;
}

/* 参会率卡片 */
.rate-card {
  background-color: #fff;
  border-radius: 16rpx;
  margin: 20rpx 30rpx;
  padding: 30rpx;
}

.rate-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 20rpx;
}

.rate-item {
  text-align: center;
}

.rate-num {
  font-size: 32rpx;
  font-weight: bold;
  color: #333;
  margin: 10rpx 0;
  display: block;
}

.rate-text {
  font-size: 24rpx;
  color: #666;
  display: block;
}

/* 任务卡片 */
.task-card {
  background-color: #fff;
  border-radius: 16rpx;
  margin: 20rpx 30rpx;
  padding: 30rpx;
}

.task-title {
  font-size: 32rpx;
  font-weight: bold;
  color: #333;
  margin-bottom: 20rpx;
  display: block;
}
</style>