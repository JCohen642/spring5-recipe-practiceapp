package cohen.recipe.practiceapp.demospring5recipepracticeapp.controllers;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Slf4j
//The next line, the @Controller annotation makes this controller a spring bean causing it to get picked up by the spring boot default package scan. 
@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;    
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
    
}