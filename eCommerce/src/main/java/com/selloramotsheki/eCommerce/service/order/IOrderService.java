package com.selloramotsheki.eCommerce.service.order;

import com.selloramotsheki.eCommerce.Dto.OrderDto;
import com.selloramotsheki.eCommerce.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
