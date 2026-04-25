package com.undergraduate.cloud_food_corner.model;

public enum Category {

    MAIN_COURSE("Main Course"),
    STREET_FOOD("Street Food"),
    SWEETS("Sweets"),
    BEVERAGES("Beverages");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
