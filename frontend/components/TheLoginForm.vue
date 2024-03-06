<template>
<form action="" class="login-action">
  <input
  type="email"
  v-model="authData.email"
  class="email"
  placeholder="Email/Login"
  autocomplete="email">
  <input
  v-model="authData.password"
  type="password"
  class="password"
  placeholder="Password"
  autocomplete="current-password"
  >
  <button @click.prevent="login(authData)">Увійти</button>
  <button @click.prevent="goToReg()">Зареєструватись</button>
</form>
</template>

<script setup>
import { useAuth } from '~/composable/useAuth';
const authData = ref({
  email:'',
  password: ''
})
const router = useRouter()
const { login } = useAuth()
const goToReg = () => {
  router.push('/register')
}
</script>

<style lang="scss">
@use "~/assets/scss/components-styles/the-login-form.scss"
</style>