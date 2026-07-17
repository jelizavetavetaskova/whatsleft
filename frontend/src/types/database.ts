export type RecipeList = {
    recipeId: number;
    title: string;
    cookingTime: number;
    difficulty: "EASY" | "MEDIUM" | "HARD";
    pathToImage: string;
}