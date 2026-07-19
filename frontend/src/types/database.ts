export type RecipeList = {
    recipeId: number;
    title: string;
    description?: string;
    cookingTime?: number;
    difficulty: "EASY" | "MEDIUM" | "HARD";
    pathToImage?: string;
}

export type Author = {
    userId: number;
    name: string;
    surname: string;
}

export type Step = {
    stepNumber: number;
    content: string;
    pathToImage: string;
}

export type Product = {
    title: string;
}

export type Ingredient = {
    product: Product;
    quantity: number;
    unit: string;
}

export type RecipeDetail = RecipeList & {
    servings?: number;
    caloriesPerServing?: number;
    author?: Author;
    steps: Step[];
    ingredients: Ingredient[];
}