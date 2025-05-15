package com.selloramotsheki.eCommerce.model;

//import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private int inventory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    //if deleted it delete everything
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;

    public Product(String name, String brand, BigDecimal price, int inventory, String description, Category category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.inventory = inventory;
        this.description = description;
        this.category = category;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public void setInventory(int inventory) {
//        this.inventory = inventory;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

}
