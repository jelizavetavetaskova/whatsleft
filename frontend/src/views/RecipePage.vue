<script setup lang="ts">
import {onMounted, ref} from "vue";
  import type {RecipeDetail} from "@/types/database.ts";
  import {useRoute} from "vue-router";

  const recipe = ref<RecipeDetail>();
  const id = useRoute().params.id

  const loading = ref(false);
  const error = ref("");

  onMounted(async () => {
    try {
      loading.value = true;

      const response = await fetch(`/api/recipes/${id}`);
      if (!response.ok) {
        error.value = await response.text();
        return;
      }

      recipe.value = await response.json();
    } catch (err) {
      if (err instanceof Error) {
        error.value = err.message;
      } else {
        error.value = "Unknown error";
      }
    } finally {
      loading.value = false;
    }
  })
</script>

<template>
  <div v-if="recipe">
    <p>{{recipe.title}}</p>
    <p>Difficulty: {{recipe.difficulty}}</p>
    <p v-if="recipe.cookingTime">Cooking time: {{recipe.cookingTime}}</p>
    <p v-if="recipe.description">{{recipe.description}}</p>
    <p v-if="recipe.servings">{{recipe.servings}} servings</p>
    <p v-if="recipe.caloriesPerServing">{{recipe.caloriesPerServing}} calories per serving</p>
    <p v-if="recipe.author">{{recipe.author.name}} {{recipe.author.surname}}</p>

    <div v-for="ingredient in recipe.ingredients" :key="ingredient.product.title">
      <p>{{ingredient.product.title}} | {{ingredient.quantity}} {{ingredient.unit}}</p>
    </div>

    <div v-for="step in recipe.steps" :key="step.stepNumber">
      <p>{{step.stepNumber}}. {{step.content}}</p>
    </div>
  </div>


</template>

<style scoped>

</style>