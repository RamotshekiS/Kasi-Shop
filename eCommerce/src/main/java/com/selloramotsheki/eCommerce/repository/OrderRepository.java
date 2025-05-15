package com.selloramotsheki.eCommerce.repository;

import com.selloramotsheki.eCommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
