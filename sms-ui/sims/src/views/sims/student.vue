<template>
  <div>
    <el-row :gutter="5" style="margin-bottom: 20px;">
      <el-col :span="6">
        <el-input v-model="keyWord" class="input-with-select" placeholder="关键字搜索">
          <el-button slot="append" icon="el-icon-search" @click="test"></el-button>
        </el-input>
      </el-col>

      <el-col :span="6">
        <el-button @click="test">添加学生</el-button>
      </el-col>
    </el-row>
    <el-row>
      <el-table
        border
        stripe
        :data="tableData"
        style="width: 100%">
        <el-table-column
          label="序号"
          type="index"
          width="50"
          align="center">
        </el-table-column>
        <el-table-column
          prop="date"
          label="学校名称"
          width="180">
        </el-table-column>
        <el-table-column
          prop="name"
          label="所属班级"
          width="180">
        </el-table-column>
        <el-table-column
          prop="address"
          label="姓名">
        </el-table-column>
        <el-table-column
          fixed="right"
          label="操作"
          width="150">
          <template slot-scope="scope">
            <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
            <el-button @click="handleClick(scope.row)" type="text" size="small">编辑</el-button>
            <el-button @click="handleClick(scope.row)" type="text" size="small">删除</el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        layout="prev, pager, next"
        :total="total"
        :current-page.sync="pageNo"
        :page-size="limit"
        @current-change="handleCurrentChange">
      </el-pagination>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'student',

  data () {
    return {
      keyWord: '',
      pageNo: 1, // 当前页码
      limit: 10, // 每页限制数量
      total: 0, // 数据总条数
      oldPage: 1, // 记录历史页码
      tableData: [{
        name: '学校名称',
        date: '2016-05-02',
        address: '上海市普陀区金沙江路 1518 弄'
      }, {
        date: '2016-05-04',
        name: '学校名称',
        address: '上海市普陀区金沙江路 1517 弄'
      }, {
        date: '2016-05-01',
        name: '学校名称',
        address: '上海市普陀区金沙江路 1519 弄'
      }, {
        date: '2016-05-03',
        name: '学校名称',
        address: '上海市普陀区金沙江路 1516 弄'
      }]
    }
  },

  methods: {
    test () {
      alert(123)
    },
    handleClick (row) {
      console.log(row)
    },

    handleCurrentChange (page) {
      this.pageNo = this.oldPage // 进入回调就赋值防止消息弹窗下面看到当前页是变化后页码
      this.$confirm('是否继续翻页？', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.pageNo = page
        this.getList() // 获取对应页码数据方法
      })
    },
  },

  watch: {
    pageNo (val, old) {
      this.oldPage = old
    }
  },
}
</script>

<style scoped>

</style>
