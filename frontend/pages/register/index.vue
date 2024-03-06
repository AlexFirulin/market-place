<template>
  <div class="login-wrapper">
    <the-breadcamp :links="links" />
    <div class="login">
      <span class="registration">Реєстарція</span>
      <form class="input-form">
        <input type="email"
               v-model="authData.email"
               placeholder="Email"
               class="email">
        <input type="email"
               placeholder="Ім'я"
               v-model="authData.name"
               class="email">
        <input placeholder="Пароль"
               v-model="authData.password"
               type="password"
               class="email">
        <input type="password"
               v-model="authData.confirmPassword"
               placeholder="Підтвендження паролю"
               class="email">
        <div class="emails-check">
          <input type="checkbox"
                 id="mailing"
                 class="send-mails">
          <label for="mailing">Надсилати мені електронні листи з новинами і новими товарами</label>
        </div>
        <div class="emails-check">
          <input type="checkbox"
                 id="agree"
                 class="send-mails">
          <label for="agree">Приймаю умови користування та політіку конфіденційності</label>
        </div>
      </form>
      <button class="call-to-action">Зареєструватись</button>
      <div class="divider">
        <hr>
        <span class="divide-text">або за допомогою</span>
        <hr>
      </div>
      <div class="social-login">
        <button class="facebook-login">
          <img src="/images/Socials-facebook.svg"
               alt="">
          <span>Facebook</span>
        </button>
        <button class="facebook-login">
          <img src="/images/Socials-google.svg"
               alt="">
          <span>Facebook</span>
        </button>
      </div>
    </div>
  </div>
</template>

<script setup>
import TheBreadcamp from "../../components/TheBreadcamp.vue";

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
</script>

<style lang="scss">
@use "../assets/scss/pages/login-page.scss"
</style>