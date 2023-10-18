package com.eidiko.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eidiko.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
