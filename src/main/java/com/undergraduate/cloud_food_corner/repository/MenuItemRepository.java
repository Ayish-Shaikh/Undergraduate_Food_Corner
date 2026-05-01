package com.undergraduate.cloud_food_corner.repository;

import com.undergraduate.cloud_food_corner.model.Category;
import com.undergraduate.cloud_food_corner.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findByCategory_Type(Category.CategoryType type);
}