<template>
  <div class="login-wrapper">
    <div class="login">
      <span class="registration">Реєстарція</span>
      <form class="input-form">
        <input type="email"
               placeholder="Email"
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
          <img src="/images/Socials-facebook.svg" alt="">
          <span>Facebook</span>
        </button>
        <button class="facebook-login">
          <img src="/images/Socials-google.svg" alt="">
          <span>Facebook</span>
        </button>
      </div>
    </div>
  </div>
</template>
<script>
</script>

<style lang="scss">
@use "~/assets/scss/pages/login-page.scss"
</style>