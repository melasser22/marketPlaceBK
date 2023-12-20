package com.Products.ps.products.repositories;
import com.Products.ps.models.product.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {
    Products findByproductCode(String productCode);
    Products findBysaasProductId(long SaasProductId);

    @Query("SELECT p FROM Products p WHERE p.isEnabled ='Y'")
    List<Products> findAllAvailableProducts();


    List<Products> findAll();
}
