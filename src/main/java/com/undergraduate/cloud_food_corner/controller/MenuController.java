package com.undergraduate.cloud_food_corner.controller;

import com.undergraduate.cloud_food_corner.model.Category;
import com.undergraduate.cloud_food_corner.model.MenuItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/api/menu")
public class MenuController {
    private List<MenuItem> getSampleMenu(){
        return Arrays.asList(

                new MenuItem(1L, "Ilish Bhapa", "Steamed hilsa in mustard",
                        220.0, Category.MAIN_COURSE, "/images/ilish.png"),
                new MenuItem(2L, "Kosha Mangsho", "Slow cooked mutton curry",
                        280.0, Category.MAIN_COURSE, "/images/mangsho.png"),
                new MenuItem(3L, "Bhoger Khichuri", "Rice and lentil Comfort bowl",
                        120.0, Category.MAIN_COURSE, "/images/khichuri.png"),

                new MenuItem(4L, "Phuchka", "Tamarind water crispy puri",
                        60.0, Category.STREET_FOOD, "/images/phuchka.png"),
                new MenuItem(5L, "Ghugni", "Spiced yellow pea curry",
                        80.0, Category.STREET_FOOD, "/images/ghugni.png"),
                new MenuItem(6L, "Jhal Muri", "Spicy puffed rice mix",
                        50.0, Category.STREET_FOOD, "/images/jhalmuri.png"),

                new MenuItem(7L, "Mishti Doi", "Sweet fermented yoghurt",
                        70.0, Category.SWEETS, "/images/mishtidoi.png"),
                new MenuItem(8L, "Sandesh", "Fresh chhena sweet",
                        90.0, Category.SWEETS, "/images/sandesh.png"),
                new MenuItem(9L, "Rasgulla", "Soft spongy chhena balls",
                        80.0, Category.SWEETS, "/images/rasgulla.png"),

                new MenuItem(10L, "Aam Panna", "Raw mango cooler",
                        60.0, Category.BEVERAGES, "/images/aampanna.png"),
                new MenuItem(11L, "Lassi", "Sweet yoghurt drink",
                        70.0, Category.BEVERAGES, "/images/lassi.png")
        );
    }
    @GetMapping
    public String showMenu(Model model){
        List<MenuItem> menuItems = getSampleMenu();

        model.addAttribute("menuItems", menuItems);
        model.addAttribute("mainCourse", menuItems.stream()
                .filter(item -> item.getCategory() == Category.MAIN_COURSE)
                .toList());
        model.addAttribute("streetFood", menuItems.stream()
                .filter(item -> item.getCategory() == Category.STREET_FOOD)
                .toList());
        model.addAttribute("sweets", menuItems.stream()
                .filter(item -> item.getCategory() == Category.SWEETS)
                .toList());
        model.addAttribute("beverages", menuItems.stream()
                .filter(item -> item.getCategory() == Category.BEVERAGES)
                .toList());
        model.addAttribute("categories", Category.values());

        return "menu";
    }
}
