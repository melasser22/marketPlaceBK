package com.saas.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saas.products.model.ProductCss;

public interface ProductCssRepository extends JpaRepository<ProductCss, Long>{
    List<ProductCss> findByproductCode(String productCode);
    List<ProductCss> findAll();

}
