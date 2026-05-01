package com.undergraduate.cloud_food_corner.repository;

import com.undergraduate.cloud_food_corner.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}