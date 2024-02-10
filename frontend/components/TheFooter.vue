<template>
  <footer class="footer-wrapper">
    <div class="footer-top-info">
      <div class="text">Назва компании</div>
      <div class="text">Соц сети</div>
    </div>
    <nav class="useful-links">
      <div class="links-wrapper items-start">
        <nuxt-link to="">Про компанію</nuxt-link>
        <nuxt-link to="">Часті питання</nuxt-link>
        <nuxt-link to="">Оплата та доставка</nuxt-link>
      </div>
      <div class="links-wrapper items-center">
        <nuxt-link to="">Поради покупцям</nuxt-link>
        <nuxt-link to="">Поради продавцям</nuxt-link>
        <nuxt-link to="">Служба підтримки</nuxt-link>
      </div>
      <div class="links-wrapper items-end">
        <nuxt-link to="">Політика конфіденційності</nuxt-link>
        <nuxt-link to="">Правила користування</nuxt-link>
        <nuxt-link to="">Локализация</nuxt-link>
      </div>
    </nav>
  </footer>
</template>
<style lang="scss">
@use "~/assets/scss/components-styles/the-footer.scss"
</style>