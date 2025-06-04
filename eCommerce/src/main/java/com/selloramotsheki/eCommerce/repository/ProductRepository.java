package com.selloramotsheki.eCommerce.repository;

import com.selloramotsheki.eCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Long countByBrandAndName(String brand, String name);

    List<Product> findByBrandAndName(String brand, String name);

    List<Product> findByCategoryName(String category);

    List<Product> findByBrand(String brand);

    List<Product> findByCategoryNameAndBrand(String category, String brand);

    List<Product> findByName(String name);

    boolean existsByNameAndBrand(String name, String brand);
}
