package com.undergraduate.cloud_food_corner.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {

    private String customerName;
    private String deliveryAddress;
    private String phone;
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        this.items.add(item);
    }

}
