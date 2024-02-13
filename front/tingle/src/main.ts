import { createApp } from 'vue'
import { createPinia } from 'pinia'
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap';
import './input.css'

import App from '@/App.vue'
import router from './router'
import './assets/global.css'

const app = createApp(App)

const pinia = createPinia()
pinia.use(piniaPluginPersistedstate)

app.use(pinia)
app.use(router)


app.mount('#app')
