package com.undergraduate.cloud_food_corner.controller;

import com.undergraduate.cloud_food_corner.model.Category;
import com.undergraduate.cloud_food_corner.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService){
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    public String showMenu(Model model){
        model.addAttribute("menuItems", menuService.getAllItems());
        model.addAttribute("mainCourse", menuService.getByCategory(Category.CategoryType.MAIN_COURSE));
        model.addAttribute("streetFood", menuService.getByCategory(Category.CategoryType.STREET_FOOD));
        model.addAttribute("sweets", menuService.getByCategory(Category.CategoryType.SWEETS));
        model.addAttribute("beverages", menuService.getByCategory(Category.CategoryType.BEVERAGES));
        model.addAttribute("categories", Category.CategoryType.values());
        return "menu";
    }
}
