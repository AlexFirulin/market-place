<template>
  <div class="login-wrapper">
    <the-breadcamp :links="links" />
    <div
      v-if="!isAuth"
      class="login"
    >
      <span class="registration">Реєстарція</span>
      <client-only>
        <form
          class="input-form"
          @submit.prevent="register(authData )"
        >
          <input
            v-once
            v-model="authData.email"
            type="email"
            placeholder="Email"
            autocomplete="email"
            class="email"
            :class="{'border-red-500 border-2':!validateEmail(authData.email)}"
            @input.once="validateEmail(authData.email)"
          >

          <input
            v-model="authData.name"
            type="text"
            placeholder="Ім'я"
            autocomplete="username"
            maxlength="15"
            class="email"
          >
          <input
            v-model="authData.password"
            placeholder="Пароль"
            type="password"
            class="email"
            autocomplete="new-password"
          >
          <input
            v-model="authData.confirmPassword"
            type="password"
            placeholder="Підтвендження паролю"
            autocomplete="new-password"
            class="email"
          >
          <div class="emails-check">
            <input
              id="mailing"
              type="checkbox"
              class="send-mails"
            >
            <label for="mailing">Надсилати мені електронні листи з новинами і новими товарами</label>
          </div>
          <div class="emails-check">
            <input
              id="agree"
              type="checkbox"
              class="send-mails"
            >
            <label for="agree">Приймаю умови користування та політіку конфіденційності</label>
          </div>
          <button
            type="submit"
            class="call-to-action"
          >
            Зареєструватись
          </button>
        </form>
      </client-only>

      <div class="divider">
        <hr>
        <span class="divide-text">або за допомогою</span>
        <hr>
      </div>
      <div class="social-login">
        <button class="facebook-login">
          <img
            src="/images/Socials-facebook.svg"
            alt=""
          >
          <span>Facebook</span>
        </button>
        <button class="facebook-login">
          <img
            src="/images/Socials-google.svg"
            alt=""
          >
          <span>Facebook</span>
        </button>
      </div>
    </div>
  </div>
</template>

<script setup>
import TheBreadcamp from "../../components/TheBreadcamp.vue";
import { useAuth } from "~/composable/useAuth";
import { useValidation } from "~/composable/useValidation";

const { validateEmail } = useValidation()

const { register } = useAuth()
const links = [{
  label: 'Головна сторінка',
  to: '/',
  icon: '/icons/chevron.svg'
}, {
  label: 'Реєстрація',
  to: '/register'
}]
const authData = ref(
  {
    email: '',
    name: '',
    password: '',
    confirmPassword: ''
  }
)
const isAuth = ref(false)
</script>

<style lang="scss">
@use "../assets/scss/pages/login-page.scss"
</style>