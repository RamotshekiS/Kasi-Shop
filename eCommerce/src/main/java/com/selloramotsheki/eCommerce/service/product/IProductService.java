package com.selloramotsheki.eCommerce.service.product;

import com.selloramotsheki.eCommerce.Dto.ProductDto;
import com.selloramotsheki.eCommerce.model.Product;
import com.selloramotsheki.eCommerce.request.AddProductRequest;
import com.selloramotsheki.eCommerce.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    //List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getCovertedProduct(List<Product> products);

    ProductDto convertToDto(Product product);
}
