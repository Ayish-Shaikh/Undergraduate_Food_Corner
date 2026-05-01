package com.undergraduate.cloud_food_corner.service;

import com.undergraduate.cloud_food_corner.model.Category;
import com.undergraduate.cloud_food_corner.model.MenuItem;
import com.undergraduate.cloud_food_corner.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuItemRepository menuItemRepository;

    public MenuService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public List<MenuItem> getAllItems() {
        return menuItemRepository.findAll();
    }

    public List<MenuItem> getByCategory(Category.CategoryType categoryType) {
        return getAllItems().stream()
                .filter(item -> item.getCategory() != null
                        && item.getCategory().getType() == categoryType)
                .toList();
    }
}