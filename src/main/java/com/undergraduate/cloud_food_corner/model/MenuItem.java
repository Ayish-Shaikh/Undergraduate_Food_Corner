package com.undergraduate.cloud_food_corner.model;

import lombok.Data;

@Data
public class MenuItem {
    private Long id;
    private String name;
    private String description;
    private double price;
    private Category category;
    private String imageUrl;

    public MenuItem(Long id, String name, String description,
                    double price, Category category,
                    String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
    }
}


