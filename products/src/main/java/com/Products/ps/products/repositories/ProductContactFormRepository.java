package com.Products.ps.products.repositories;

import com.Products.ps.models.product.ProductContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductContactFormRepository extends JpaRepository<ProductContactForm, Long> {

    ProductContactForm save (ProductContactForm productContactForm) ;

}
