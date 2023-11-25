package com.Products.ps.products.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Products.ps.models.product.ProductAsset;

import java.util.List;

public interface ProductAssetRepository extends JpaRepository<ProductAsset, Long>{
    List<ProductAsset> findByproductCode(String productCode);
    List<ProductAsset> findAll();

}