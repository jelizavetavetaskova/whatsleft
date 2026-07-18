export type RecipeList = {
    recipeId: number;
    title: string;
    description: string;
    cookingTime: number;
    difficulty: "EASY" | "MEDIUM" | "HARD";
    pathToImage: string;
}