package com.selloramotsheki.eCommerce.Dto;

import com.selloramotsheki.eCommerce.model.Product;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class CartItemDto {
    private Long id;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
