package com.selloramotsheki.eCommerce.Dto;

import com.selloramotsheki.eCommerce.model.Category;
import com.selloramotsheki.eCommerce.model.Image;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private int inventory;
    private Category category;
    private List<ImageDto> images;

}
