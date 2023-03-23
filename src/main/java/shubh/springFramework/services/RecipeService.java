package shubh.springFramework.services;

import org.springframework.stereotype.Service;
import shubh.springFramework.commands.RecipeCommand;
import shubh.springFramework.domain.Recipe;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
