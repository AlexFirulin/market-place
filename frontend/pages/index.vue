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
             :key="item.name"
             class="small-mid-items">
          <img :src="item.img"
               alt="/"
               class="img">
          <p>{{ item.name }}</p>
        </div>
      </div>
      <div class="category-bottom">
        <div class="black-box">
          <img src="/images/categories/photo19.png"
               alt="black-box">
          <div class="auction-name">Чорна скринька</div>
          <div class="bid-data">
            24.03.2025
          </div>
          <div class="bid-cost">
            <div> Ставок 55</div>
            <div> 3254 uah</div>
          </div>
        </div>
        <div class="wrapper-small">
          <div v-for="(item, index) in bottomItems.slice(0, 4)"
               :key="index"
               class="bottom-item">
            <div class="items">
              <img :src="item.img"
                   alt="/"
                   class="img">
              <p>{{ item.name }}</p>
            </div>
          </div>
        </div>
      </div>
      <div class="end-item-wrapper">
      <div v-for="(item, index) in bottomItems.slice(4)"
           :key="index"
           class="end-item">
        <div class="items">
          <img :src="item.img"
               alt="/"
               class="img">
          <p>{{ item.name }}</p>
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
    name: 'Кухонне приладдя',
    img: '/images/categories/photo18.png'
  },
  {
    name: 'Книги',
    img: '/images/categories/photo17.png'
  },
  {
    name: 'Сад, дача та город',
    img: '/images/categories/photo13.png'
  },
  {
    name: 'Будівництво та ремонт',
    img: '/images/categories/photo14.png'
  },
  {
    name: 'Краса та здоров’я',
    img: '/images/categories/photo15.png'
  },
  {
    name: 'Спорт',
    img: '/images/categories/photo16.png'
  },
  {
    name: 'Побутова техніка',
    img: '/images/categories/photo101.png'
  },
  {
    name: 'Товари для бізнесу',
    img: '/images/categories/photo100.png'
  }
]
</script>



<style lang="scss">@use "~/assets/scss/pages/the-main-page.scss"</style>