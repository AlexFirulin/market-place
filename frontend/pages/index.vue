<template>
  <main class="main-page">
    <legend class="main-legend">
      <img src="/images/Intersect.png"
           alt="black-box"
           class="legend-image">
      <div class="legend-info">
        <h2>Чорна скринька</h2>
        <h5>Детальніше ></h5>
      </div>
    </legend>
    <div class="content">
      <div class="category-top">
        <div class="small-wrapper">
          <div v-for="(item, index) in categoryItems"
               :key="index"
               class="small-items">
            <img :src="item.img"
                 alt="/"
                 class="img" />
            <p>{{ item.name }}</p>
          </div>
        </div>
        <div class="bigger-item">
          <img src="/images/photo4.png"
               alt="/">
          <p>Мистецтво</p>
        </div>
      </div>
      <div class="category-mid">
        <div v-for="item in midItems"
             :key="item.name" class="small-mid-items">
              <img :src="item.img" alt="/" class="img">
              <p>{{ item.name }}</p>
            </div>
      </div>
      <div class="category-bottom">
        <div v-for="(item, index) in bottomItems" :key="item.name" class="bottom-item">
          <div class="items" >
            <img :src="item.img" alt="/" class="img" :class="{'black-box' : index === 0}">
            <p>{{ item.name }}</p>
            <div v-if="index === 0" class="bid-data">
              <div>{{ item.date }}</div>
              <div class="bid-cost">
                <div> Ставок {{ item.bids }}</div>
                <div>{{ item.price }}</div>
              </div>

            </div>
          </div>
        </div>
      </div>
    </div>
  </main>
</template>

<script setup>
const categoryItems = [
  {
    name: 'Одяг та взуття',
    img: '/images/photo.png'
  },
  {
    name: 'Меблі',
    img: '/images/photo1.png'
  },
  {
    name: 'Електроніка',
    img: '/images/photo2.png'
  },
  {
    name: 'Аксесуари',
    img: '/images/photo3.png'
  }
];
const midItems = [
  {
    name: 'Дитячі товари',
    img: '/images/categories/photo5.png'
  },
  {
    name: 'Ювелірні вироби',
    img: '/images/categories/photo6.png'
  },
  {
    name: 'Колекціонерські предмети',
    img: '/images/categories/photo7.png'
  },
  {
    name: 'Природні матеріали',
    img: '/images/categories/photo8.png'
  },
  {
    name: 'Туризм/відпочинок',
    img: '/images/categories/photo9.png'
  },
  {
    name: 'Музичні інструменти',
    img: '/images/categories/photo10.png'
  },
  {
    name: 'Текстиль',
    img: '/images/categories/photo11.png'
  },
  {
    name: 'Автотовари',
    img: '/images/categories/photo12.png'
  }
]
const bottomItems = [
{
    name: 'Туризм/відпочинок',
    img: '/images/categories/photo19.png',
    date:'25.4.2024',
    bids: '32',
    price: '3254'
  },
{
    name: 'Дитячі товари',
    img: '/images/categories/photo100.png'
  },
  {
    name: 'Ювелірні вироби',
    img: '/images/categories/photo101.png'
  },
  {
    name: 'Колекціонерські предмети',
    img: '/images/categories/photo13.png'
  },
  {
    name: 'Природні матеріали',
    img: '/images/categories/photo14.png'
  },
  {
    name: 'Туризм/відпочинок',
    img: '/images/categories/photo15.png'
  },
  {
    name: 'Туризм/відпочинок',
    img: '/images/categories/photo16.png'
  },
  {
    name: 'Туризм/відпочинок',
    img: '/images/categories/photo17.png'
  },
  {
    name: 'Туризм/відпочинок',
    img: '/images/categories/photo18.png'
  },


]
</script>



<style lang="scss">@use "~/assets/scss/pages/the-main-page.scss"</style>