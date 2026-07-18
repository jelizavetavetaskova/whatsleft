import RecipesList from "@/views/RecipesList.vue";
import RecipePage from "@/views/RecipePage.vue";
import {createRouter, createWebHistory} from "vue-router";

const routes = [
    {path: "/", component: RecipesList},
    {path: "/recipes/:id", component: RecipePage}
];

export const router = createRouter({
    history: createWebHistory(),
    routes
})