package com.undergraduate.cloud_food_corner;

import com.undergraduate.cloud_food_corner.controller.MenuController;
import com.undergraduate.cloud_food_corner.model.Category;
import com.undergraduate.cloud_food_corner.model.MenuItem;
import com.undergraduate.cloud_food_corner.service.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(MenuController.class)
class MenuControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    MenuService menuService;

    @Test
    void testMenuPage() throws Exception {
        MenuItem ilishBhapa = new MenuItem(
                1L,
                "Ilish Bhapa",
                "Steamed hilsa in mustard",
                220.0,
                Category.MAIN_COURSE,
                "/images/ilishbhapa.png"
        );

        MenuItem phuchka = new MenuItem(
                2L,
                "Phuchka",
                "Tamarind water crispy puri",
                60.0,
                Category.STREET_FOOD,
                "/images/phuchka.png"
        );

        MenuItem mishtiDoi = new MenuItem(
                3L,
                "Mishti Doi",
                "Sweet fermented yoghurt",
                70.0,
                Category.SWEETS,
                "/images/mistidoi.png"
        );

        MenuItem lassi = new MenuItem(
                4L,
                "Lassi",
                "Sweet yoghurt drink",
                70.0,
                Category.BEVERAGES,
                null
        );

        when(menuService.getAllItems()).thenReturn(List.of(ilishBhapa, phuchka, mishtiDoi, lassi));
        when(menuService.getByCategory(Category.MAIN_COURSE)).thenReturn(List.of(ilishBhapa));
        when(menuService.getByCategory(Category.STREET_FOOD)).thenReturn(List.of(phuchka));
        when(menuService.getByCategory(Category.SWEETS)).thenReturn(List.of(mishtiDoi));
        when(menuService.getByCategory(Category.BEVERAGES)).thenReturn(List.of(lassi));

        mockMvc.perform(get("/menu"))
                .andExpect(status().isOk())
                .andExpect(view().name("menu"))
                .andExpect(model().attributeExists(
                        "menuItems",
                        "mainCourse",
                        "streetFood",
                        "sweets",
                        "beverages",
                        "categories"
                ))
                .andExpect(content().string(containsString("Traditional Bengali dishes, quietly presented.")))
                .andExpect(content().string(containsString("Main Course")))
                .andExpect(content().string(containsString("Street Food")))
                .andExpect(content().string(containsString("Add to Cart")));
    }
}
