<template>
<header class="header"
:class="{ 'items-end': !auth}">
  <div v-if="auth">
  <div class="logo-wrapper">
  <div class="logo">
    <img src="/images/Logo.png" alt="logo">
  </div>
  <div class="menu">
    <div @click="auth = false">
      <img src="/images/button-login.png" alt="logo">
    </div>
    <div class="social-icons"></div>
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
</div>
<div v-else>
  <the-login-form />
</div>
</header>
</template>

<script setup>
const auth = ref(true)
</script>

<style lang="scss">
@use "~/assets/scss/components-styles/the-header.scss"
</style>