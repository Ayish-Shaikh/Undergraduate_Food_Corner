package com.undergraduate.cloud_food_corner.repository;

import com.undergraduate.cloud_food_corner.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}