package com.selloramotsheki.eCommerce.repository;

import com.selloramotsheki.eCommerce.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
   // void deleteAllByCardId(Long id);

    void deleteAllByCartId(Long id);
}
