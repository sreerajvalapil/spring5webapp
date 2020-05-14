package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.recipe.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getCategories")
    public String getCategory() {
        categoryService.persistCategory("Malabar");
        categoryService.persistCategory("Travancore");
        return categoryService.getAllCategories();

    }

}

