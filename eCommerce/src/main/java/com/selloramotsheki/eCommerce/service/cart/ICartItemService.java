package com.selloramotsheki.eCommerce.service.cart;

import com.selloramotsheki.eCommerce.model.CartItem;

public interface ICartItemService {
    void addItemtoCart(Long cartId, Long productId, int quantity);
    void removeItemFromCart(Long cartId, Long productId);
    void updateItemQuantity(Long cartId, Long productId, int quantity);

    CartItem getCartItem(Long cartId, Long productId);
}
