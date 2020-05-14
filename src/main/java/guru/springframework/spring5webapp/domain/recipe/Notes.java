package guru.springframework.spring5webapp.domain.recipe;

import guru.springframework.spring5webapp.domain.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notes extends BaseEntity {

    private String name;

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

}
