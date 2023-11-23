package com.saas.products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.saas.products.model.ProductPricingPlan;

public interface ProductPricingPlanRepository extends JpaRepository<ProductPricingPlan, Long>{
	@EntityGraph(attributePaths = "planDetails")
	List<ProductPricingPlan> findByproductCode(String productCode);
	@Query("SELECT DISTINCT ppl FROM ProductPricingPlan ppl " +
	           "LEFT JOIN FETCH ppl.pricingPlanDetails details " +
	           "WHERE ppl.productCode = :code")
	List<ProductPricingPlan> findByproductCodeWithDetails(@Param("code") String productCode);
    List<ProductPricingPlan> findAll();
}
