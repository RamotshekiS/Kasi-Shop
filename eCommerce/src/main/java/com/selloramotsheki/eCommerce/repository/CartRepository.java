package com.selloramotsheki.eCommerce.repository;

import com.selloramotsheki.eCommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
