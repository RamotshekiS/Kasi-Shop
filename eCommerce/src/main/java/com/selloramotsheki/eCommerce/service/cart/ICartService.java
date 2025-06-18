package com.selloramotsheki.eCommerce.service.cart;

import com.selloramotsheki.eCommerce.model.Cart;
import com.selloramotsheki.eCommerce.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initalizeNewCart();

    Cart getCartByUserId(Long userId);

    Cart initializeNewCart(User user);
}
