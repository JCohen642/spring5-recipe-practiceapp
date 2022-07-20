package cohen.recipe.practiceapp.demospring5recipepracticeapp.services;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
