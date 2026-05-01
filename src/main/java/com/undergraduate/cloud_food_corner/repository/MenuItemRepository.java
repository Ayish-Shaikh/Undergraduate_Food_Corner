package com.undergraduate.cloud_food_corner.repository;

import com.undergraduate.cloud_food_corner.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}