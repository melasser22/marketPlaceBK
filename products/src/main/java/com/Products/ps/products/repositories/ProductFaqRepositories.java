package com.Products.ps.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Products.ps.models.product.ProductFaq;

public interface ProductFaqRepositories extends JpaRepository<ProductFaq, Long>{
	List<ProductFaq> findByproductCode(String productCode);

}
