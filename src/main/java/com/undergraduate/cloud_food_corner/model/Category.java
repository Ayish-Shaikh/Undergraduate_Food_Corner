package com.undergraduate.cloud_food_corner.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CategoryType type;

    public Category(String name, CategoryType type) {
        this.name = name;
        this.type = type;
    }

    public Category() {
    }

    public enum CategoryType {
        MAIN_COURSE("Main Course"),
        STREET_FOOD("Street Food"),
        SWEETS("Sweets"),
        BEVERAGES("Beverages");

        private final String displayName;

        CategoryType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public CategoryType getType() {
        return type;
    }
}