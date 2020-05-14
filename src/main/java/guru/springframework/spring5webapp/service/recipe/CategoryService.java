package guru.springframework.spring5webapp.service.recipe;

import guru.springframework.spring5webapp.domain.recipe.Category;
import guru.springframework.spring5webapp.repository.recipe.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository ;

    public void persistCategory(String name) {
        Category category = Category.builder().name(name)
                .build();
        categoryRepository.save(category) ;
    }

    public String getAllCategories() {
        return categoryRepository.findAll().stream()
                    .map(Category::getName)
                    .collect(Collectors.joining(",")) ;
    }
}
