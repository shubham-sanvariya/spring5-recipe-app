package shubh.springFramework.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.springFramework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
