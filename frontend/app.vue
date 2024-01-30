<template>
  <div>
    {{ data }} 
  </div>
</template>

<script setup>

const { data} = $fetch('test/hello')
</script>