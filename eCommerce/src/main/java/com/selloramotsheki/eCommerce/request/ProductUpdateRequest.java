package com.selloramotsheki.eCommerce.request;

import com.selloramotsheki.eCommerce.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private int inventory;
    private Category category;

//    public String getName() {
//        return name;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public int getInventory() {
//        return inventory;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
}

