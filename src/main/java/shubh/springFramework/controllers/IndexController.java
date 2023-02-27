package shubh.springFramework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shubh.springFramework.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getindexPage(Model model) {
        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }
}
