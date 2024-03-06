<template>
<form action="" class="login-action">
  <input
  type="email"
  class="email"
  placeholder="Email/Login"
  autocomplete="email">
  <input
  type="password"
  class="password"
  placeholder="Password"
  autocomplete="current-password"
  >
  <button>Увійти</button>
  <button @click.prevent="goToReg()">Зареєструватись</button>
</form>
</template>

<script setup>
const router = useRouter()
const goToReg = () => {
  router.push('/register')
}
</script>

<style lang="scss">
@use "~/assets/scss/components-styles/the-login-form.scss"
</style>