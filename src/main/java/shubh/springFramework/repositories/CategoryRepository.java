package shubh.springFramework.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.springFramework.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription (String description);
}
