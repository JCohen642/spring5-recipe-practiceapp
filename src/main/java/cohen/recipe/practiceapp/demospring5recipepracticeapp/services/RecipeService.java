package cohen.recipe.practiceapp.demospring5recipepracticeapp.services;

import java.util.Set;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.Recipe;

public interface RecipeService{
    Set<Recipe> getRecipes();
    
}