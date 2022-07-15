package cohen.recipe.practiceapp.demospring5recipepracticeapp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.Recipe;
import cohen.recipe.practiceapp.demospring5recipepracticeapp.services.RecipeService;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController controller;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        controller = new IndexController(recipeService);
    }   
   
    /**
     * 
     */
    @Test
    public void testMockMVC() throws Exception{
        MockMvc mockMVC = MockMvcBuilders.standaloneSetup(controller).build();

        mockMVC.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
        
    }




    @Test
    void testGetIndexPage() throws Exception{

        //given  
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());

        Recipe recipe = new Recipe();
        recipe.setId(1L);
        recipes.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipes);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        //When
        String retValue = controller.getIndexPage(model);
        
        //Then
        assertEquals("index", retValue);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());

    }
}
