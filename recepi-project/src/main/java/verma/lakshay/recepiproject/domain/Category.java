package verma.lakshay.recepiproject.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Data
@Entity
@EqualsAndHashCode(exclude = {"recepies"})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recepies;

}
