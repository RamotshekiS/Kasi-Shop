package com.selloramotsheki.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.selloramotsheki.eCommerce.model.Image;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long productId);
}
