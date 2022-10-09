<!--侧边栏菜单-->
<template>
  <div>
    <el-menu
        style="height: calc(100vh - 50px)"
        default-active="2"
        :default-openeds="['1']"
        class="el-menu-vertical-demo">
      <el-sub-menu index="1">
        <el-icon><icon-menu /></el-icon>
        <template #title>系统管理</template>
        <el-menu-item index="user">用户管理</el-menu-item>
      </el-sub-menu>
    </el-menu>
  </div>
</template>

<script>
export default {
  name: "Aside"
}
</script>

<style scoped>

</style>