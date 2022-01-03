<template>
  <div class="navbar">
    <el-row class="tac">
      <el-menu
        default-active="1"
        class="el-menu-vertical-demo"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b">
        <el-menu-item index="1" @click="changeMenu('school')">
          <i class="el-icon-menu"></i>
          <span slot="title">学校管理</span>
        </el-menu-item>
        <el-menu-item index="2" @click="changeMenu('class')">
          <i class="el-icon-menu"></i>
          <span slot="title">班级管理</span>
        </el-menu-item>
        <el-menu-item index="3" @click="changeMenu('teacher')">
          <i class="el-icon-menu"></i>
          <span slot="title">老师管理</span>
        </el-menu-item>
        <el-menu-item index="4" @click="changeMenu('student')">
          <i class="el-icon-menu"></i>
          <span slot="title">学生管理</span>
        </el-menu-item>
        <el-menu-item index="5" @click="changeMenu('score')">
          <i class="el-icon-menu"></i>
          <span slot="title">积分管理</span>
        </el-menu-item>
        <el-menu-item index="6" @click="changeMenu('role')">
          <i class="el-icon-menu"></i>
          <span slot="title">角色管理</span>
        </el-menu-item>
        <el-menu-item index="7" @click="changeMenu('userInfo')">
          <i class="el-icon-menu"></i>
          <span slot="title">个人信息</span>
        </el-menu-item>
      </el-menu>
    </el-row>
  </div>

</template>

<script>
export default {
  name: 'AppNavbar',

  methods: {
    changeMenu (route) {
      console.log(route)
      //获取路由对象并切换
      this.$router.push(route)
    }
  }
}
</script>
<style scoped>

</style>
