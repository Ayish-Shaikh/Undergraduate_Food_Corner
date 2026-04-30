package com.undergraduate.cloud_food_corner.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {

    @NotBlank(message = "Name required")
    private String customerName;

    @NotBlank(message = "Address required")
    private String deliveryAddress;

    @Pattern(regexp = "^[0-9]{10}$", message = "Phone must be 10 digits")
    private String phone;

    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        this.items.add(item);
    }

}
