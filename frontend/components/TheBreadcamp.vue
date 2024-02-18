<template>
  <div class="bread-wrapper">
    <div v-for="(link, idx) in links"
         :key="link.label"
         class="links">
      <div class="step">
        <nuxt-link :to="link.to"
                   :class="{
                     'step-link': idx !== links.length - 1,
                     'step-select': idx === links.length - 1
                   }">
          {{ link.label }}
        </nuxt-link>
        <img :src="link.icon"
             alt="">
      </div>
    </div>
  </div>
</template>

<script setup>
const prop = defineProps({
  links: Array
})

</script>

<style lang="scss">
@use "~/assets/scss/components-styles/the-breac-camp.scss"
</style>