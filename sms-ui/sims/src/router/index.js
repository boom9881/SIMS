import Vue from 'vue'
import Router from 'vue-router'
import school from '@/views/sims/school'
import class_ from '@/views/sims/class'
import teacher from '@/views/sims/teacher'
import student from '@/views/sims/student'
import score from '@/views/sims/score'
import role from '@/views/sims/role'
import userInfo from '@/views/sims/user'
import Layout from '@/views/Layout' // 默认加载index.vue

Vue.use(Router)

export default new Router({
  mode: 'history', // 去掉url中的#
  routes: [
    {
      path: '/',
      name: 'layout', // 路由名称
      component: Layout, // 组件对象
      children: [
        {
          path: '/school',
          name: 'school',
          component: school
        },
        {
          path: '/class',
          name: 'class',
          component: class_
        },
        {
          path: '/teacher',
          name: 'teacher',
          component: teacher
        },
        {
          path: '/student',
          name: 'student',
          component: student
        },
        {
          path: '/score',
          name: 'score',
          component: score
        },
        {
          path: '/role',
          name: 'role',
          component: role
        },
        {
          path: '/userInfo',
          name: 'userInfo',
          component: userInfo
        }
      ]
    },
  ]
})
