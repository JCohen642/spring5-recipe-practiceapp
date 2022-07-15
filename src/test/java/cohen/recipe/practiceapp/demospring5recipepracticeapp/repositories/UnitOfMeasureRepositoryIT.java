package cohen.recipe.practiceapp.demospring5recipepracticeapp.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.UnitOfMeasure;




@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;
    
    
    @BeforeEach
    public void setUp() throws Exception{

    }
    
    @Test
    void testFindByDescription() throws Exception{
        Optional<UnitOfMeasure> uomOPtional = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", uomOPtional.get().getDescription());
    }
}
