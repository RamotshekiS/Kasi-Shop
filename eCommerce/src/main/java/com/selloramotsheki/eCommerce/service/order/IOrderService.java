package com.selloramotsheki.eCommerce.service.order;

import com.selloramotsheki.eCommerce.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
}
