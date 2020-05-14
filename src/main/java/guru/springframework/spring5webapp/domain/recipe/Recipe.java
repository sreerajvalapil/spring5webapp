package guru.springframework.spring5webapp.domain.recipe;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer prepTime;
    private Integer cookTime;
    private String description;
    private String urls;
    private String source;
    private String directions;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @Lob
    private Byte[] image;

    @OneToOne(cascade =CascadeType.ALL )
    private Notes note;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "recipe")
    private Set<Ingredient>  ingredientSet ;

    @ManyToMany
    @JoinTable(name="recipe_catogory" ,
            joinColumns = @JoinColumn(name="recipe_id"),
            inverseJoinColumns = @JoinColumn(name="category_id"))
    private Set<Category> categorySet ;


}
