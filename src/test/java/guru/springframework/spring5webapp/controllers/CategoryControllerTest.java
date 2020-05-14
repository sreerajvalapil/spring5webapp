package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.service.recipe.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryControllerTest  {

    CategoryController categoryController ;

    @Mock
    CategoryService categoryService ;

    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        categoryController = new CategoryController(categoryService);
        int a 

    }


    @Test
    public void testMockMvc() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(categoryController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/getCategories"))
                .andExpect(MockMvcResultMatchers.status().isOk()) ;
    }



}