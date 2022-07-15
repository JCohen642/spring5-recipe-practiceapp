package cohen.recipe.practiceapp.demospring5recipepracticeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
    
}
