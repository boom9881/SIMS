// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'// 引入element-ui的样式文件

Vue.use(ElementUI)// 通过这个命令使所有的element-ui标签(<el-*></el-*>)可被解析

// eslint-disable-next-line no-new
new Vue({
  el: '#app',
  router: router,
  render: render => render(App)
})

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
