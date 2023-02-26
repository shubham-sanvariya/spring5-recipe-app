package shubh.springFramework.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.springFramework.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription (String description);

}
