package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repository.recipe.CategoryRepository;
import guru.springframework.spring5webapp.repository.recipe.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IndexController {
    @Autowired
    private  CategoryRepository categoryRepository ;
    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @GetMapping("/sreeIndex")
    public String get() {
       Long id =  categoryRepository.findByName("Indian").get().getId();
        return "The category Id for indian is : " + id ;
    }
}
