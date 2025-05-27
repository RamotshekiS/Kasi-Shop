package com.selloramotsheki.eCommerce.service.order;

import com.selloramotsheki.eCommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);

    List<Order> getUserOrders(Long userId);
}
