package com.Products.ps.products.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Products.ps.models.product.ProductPartner;

import java.util.List;

public interface ProductPartnerRepository extends JpaRepository<ProductPartner, Long>{
    List<ProductPartner> findByproductCode(String productCode);
    List<ProductPartner> findAll();

}