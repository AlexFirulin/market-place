<template>
  <div class="login-wrapper">
    <the-breadcamp :links="links" />
    <div class="login">
      <span class="registration">Реєстарція</span>
      <form @submit.prevent="register"
            class="input-form">
        <input type="email"
               v-model="authData.email"
               placeholder="Email"
               autocomplete="email"
               class="email">
        <input type="text"
               placeholder="Ім'я"
               autocomplete="username"
               v-model="authData.name"
               class="email">
        <input placeholder="Пароль"
               v-model="authData.password"
               type="password"
               class="email"
               autocomplete="new-password">
        <input type="password"
               v-model="authData.confirmPassword"
               placeholder="Підтвендження паролю"
               autocomplete="new-password"
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
        <button type="submit"
                class="call-to-action">Зареєструватись</button>
      </form>

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
const register = async () => {
  try {
    const response = await fetch('http://localhost:8080/api/auth/register', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(authData.value)
    });
    const responseData = await response.json();
    console.log(responseData);
  } catch (error) {
    console.error('Registration failed:', error);
  }
}
</script>

<style lang="scss">
@use "../assets/scss/pages/login-page.scss"
</style>