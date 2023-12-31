package com.eidiko.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eidiko.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

