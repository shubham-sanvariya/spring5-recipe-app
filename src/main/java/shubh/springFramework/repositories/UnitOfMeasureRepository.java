package shubh.springFramework.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.springFramework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
