package shubh.springFramework.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UnitOfMeasure {

    @Id // id value for the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
