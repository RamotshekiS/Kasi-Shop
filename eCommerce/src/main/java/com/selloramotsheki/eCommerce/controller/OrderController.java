package com.selloramotsheki.eCommerce.controller;

import com.selloramotsheki.eCommerce.model.Order;
import com.selloramotsheki.eCommerce.response.ApiResponse;
import com.selloramotsheki.eCommerce.service.order.IOrderService;
import com.selloramotsheki.eCommerce.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/orders")
public class OrderController {
    private final IOrderService orderService;

    public ResponseEntity<ApiResponse> createOrder(Long userId) {
        try {
            Order order = orderService.placeOrder(userId);
            return ResponseEntity.ok(new ApiResponse("Item placed success", order));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
