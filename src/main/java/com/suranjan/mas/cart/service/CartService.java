package com.suranjan.mas.cart.service;

import com.suranjan.mas.cart.repository.CartItemRepository;
import com.suranjan.mas.cart.repository.CartRepository;
import com.suranjan.mas.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ProductRepository productRepository;

    public CartService(
            CartRepository cartRepository,
            CartItemRepository cartItemRepository,
            ProductRepository productRepository)
    {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.productRepository = productRepository;
    }
}
