<template>
  <div>
    {{ data }} 
  </div>
</template>

<script setup>

const { data} = $fetch('http://localhost:8080/test/hello')
</script>