package cohen.recipe.practiceapp.demospring5recipepracticeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{ 
    Optional<UnitOfMeasure> findByDescription(String description);
}