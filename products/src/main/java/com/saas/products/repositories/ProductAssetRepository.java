package com.saas.products.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.saas.products.model.ProductAsset;

import java.util.List;

public interface ProductAssetRepository extends JpaRepository<ProductAsset, Long>{
    List<ProductAsset> findByproductCode(String productCode);
    List<ProductAsset> findAll();

}