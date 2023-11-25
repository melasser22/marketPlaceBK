package com.Products.ps.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Products.ps.models.product.ProductCss;


public interface ProductCssRepository extends JpaRepository<ProductCss, Long>{
    ProductCss findByproductCode(String productCode);
    List<ProductCss> findAll();

}
