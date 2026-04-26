package com.undergraduate.cloud_food_corner;

import com.undergraduate.cloud_food_corner.controller.MenuController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(MenuController.class)
public class MenuControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testMenuPage() throws Exception {
        mockMvc.perform(get("/api/menu"))
                .andExpect(status().isOk())
                .andExpect(view().name("menu"))
                .andExpect(model().attributeExists("menuItems", "mainCourse", "streetFood", "sweets", "beverages", "categories"))
                .andExpect(content().string(containsString("Traditional Bengali dishes, quietly presented.")))
                .andExpect(content().string(containsString("Main Course")))
                .andExpect(content().string(containsString("Street Food")))
                .andExpect(content().string(containsString("Add to Cart")));
    }
}
