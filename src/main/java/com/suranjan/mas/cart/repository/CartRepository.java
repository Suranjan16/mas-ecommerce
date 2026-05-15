package com.suranjan.mas.cart.repository;

import com.suranjan.mas.auth.entity.User;
import com.suranjan.mas.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}
