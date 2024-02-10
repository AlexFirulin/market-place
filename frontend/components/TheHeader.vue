<template>
<header class="header">
  <div class="logo-wrapper">
  <div class="logo">
    <img src="../assets/images/Logo.png" alt="">
  </div>
  <div class="menu">
    <img src="../assets/images/button-login.png" alt="">
  </div>
</div>
<nav class="navigation-wrapper">
  <ul class="nav-item">
    <li><nuxt-link to="">Каталог</nuxt-link></li>
    <li><nuxt-link to="">Пошук</nuxt-link></li>
    <li><nuxt-link to="">Продати</nuxt-link></li>
    <li><nuxt-link to="">Аукціон</nuxt-link></li>
    <li><nuxt-link to="">Додадково</nuxt-link></li>
  </ul>
</nav>
</header>
</template>

<script setup>
</script>

<style lang="scss">
@use "~/assets/scss/components-styles/the-header.scss"
</style>