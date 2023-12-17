package com.Products.ps.products.repositories;

import com.Products.ps.models.product.ProductTermsPrivacy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductTermsPrivacyRepository extends JpaRepository<ProductTermsPrivacy, Long> {
   List< ProductTermsPrivacy> findByproductCode(String productCode);
    List<ProductTermsPrivacy> findAll();
}
