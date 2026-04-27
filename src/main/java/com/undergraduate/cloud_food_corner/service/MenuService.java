package com.undergraduate.cloud_food_corner.service;

import com.undergraduate.cloud_food_corner.model.Category;
import com.undergraduate.cloud_food_corner.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MenuService {

    public List<MenuItem> getAllItems(){

        return Arrays.asList(
                new MenuItem(1L, "Ilish Bhapa", "Steamed hilsa in mustard",
                        220.0, Category.MAIN_COURSE, "/images/ilishbhapa.png"),
                new MenuItem(2L, "Kosha Mangsho", "Slow cooked mutton curry",
                        280.0, Category.MAIN_COURSE, "/images/koshamangsho.png"),
                new MenuItem(3L, "Bhoger Khichuri", "Rice and lentil Comfort bowl",
                        120.0, Category.MAIN_COURSE, "/images/khichudi.png"),

                new MenuItem(4L, "Phuchka", "Tamarind water crispy puri",
                        60.0, Category.STREET_FOOD, "/images/phuchka.png"),
                new MenuItem(5L, "Ghugni", "Spiced yellow pea curry",
                        80.0, Category.STREET_FOOD, "/images/ghugni.png"),
                new MenuItem(6L, "Jhal Muri", "Spicy puffed rice mix",
                        50.0, Category.STREET_FOOD, "/images/jhalmuri.png"),

                new MenuItem(7L, "Mishti Doi", "Sweet fermented yoghurt",
                        70.0, Category.SWEETS, "/images/mistidoi.png"),
                new MenuItem(8L, "Sandesh", "Fresh chhena sweet",
                        90.0, Category.SWEETS, "/images/sandesh.png"),
                new MenuItem(9L, "Rasgulla", "Soft spongy chhena balls",
                        80.0, Category.SWEETS, "/images/rosogolla.png"),

                new MenuItem(10L, "Aam Panna", "Raw mango cooler",
                        60.0, Category.BEVERAGES, null),
                new MenuItem(11L, "Lassi", "Sweet yoghurt drink",
                        70.0, Category.BEVERAGES, null)
        );
    }

    public List<MenuItem> getByCategory(Category category){
        return getAllItems().stream()
                .filter(item -> item.getCategory() == category)
                .toList();
    }
}
