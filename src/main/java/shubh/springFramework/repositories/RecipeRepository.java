package shubh.springFramework.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.springFramework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
