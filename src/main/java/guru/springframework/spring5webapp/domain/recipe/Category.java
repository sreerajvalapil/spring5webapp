package guru.springframework.spring5webapp.domain.recipe;

import guru.springframework.spring5webapp.domain.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "categorySet")
    private Set<Recipe> recipeSet;

    private final Instant created = Instant.now();

}
