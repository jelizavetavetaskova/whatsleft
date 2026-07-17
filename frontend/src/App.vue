<script setup lang="ts">
import {onMounted, ref} from "vue";
import type {RecipeList} from "@/types/database.ts";
import type {Page} from "@/types/app.ts";
  const recipes = ref<RecipeList[]>([]);

  const error = ref("");
  const loading = ref(false);

  onMounted(async () => {
    try {
      loading.value = true;
      const response = await fetch("/api/recipes");

      if (!response.ok) {
        error.value = await response.text();
        return;
      }

      const data: Page<RecipeList> = await response.json();
      recipes.value = data.content;
    } catch (err) {
      if (err instanceof Error) error.value = err.message;
      else error.value = "Unknown error";
    } finally {
      loading.value = false;
    }
  })
</script>

<template>
  <h1>Recipes</h1>

  <div v-if="loading">Loading...</div>
  <div v-else-if="error">{{error}}</div>
  <div v-else>
    <div v-for="recipe in recipes" :key="recipe.recipeId">
      <p>{{recipe.title}}</p>
      <p>{{recipe.cookingTime}}</p>
      <p>{{recipe.difficulty}}</p>
    </div>
  </div>
</template>

<style scoped></style>
