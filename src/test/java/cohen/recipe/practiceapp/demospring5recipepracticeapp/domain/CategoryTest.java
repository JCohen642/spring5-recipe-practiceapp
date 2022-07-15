package cohen.recipe.practiceapp.demospring5recipepracticeapp.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CategoryTest { 
    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
        // fail();
    }

    @Test
    void testGetId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());

    }

    @Test
    void testGetDescription() {
        // fail();

    }


    @Test
    void testGetRecipes() {
        // fail();
    }
}
