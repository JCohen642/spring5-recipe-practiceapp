package cohen.recipe.practiceapp.demospring5recipepracticeapp.services;

import java.util.Set;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {
   
    Set<UnitOfMeasureCommand> listAllUoms();

}
