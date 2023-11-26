package com.Products.ps.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductPricingPlan;
import com.Products.ps.products.api.ProductPricingPlanService;

@RestController
@RequestMapping("/api/v1")
public class ProductPricingPlanController {

	@Autowired
    private ProductPricingPlanService productPricingPlanService;
	
	@GetMapping("/get-product-pricing-list")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductPricingPlan>> getProductPricingPlan(String productCode){
        return this.productPricingPlanService.getProductPricingPlan(productCode);
    }
	
    @GetMapping("/product-pricing-list")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductPricingPlan>> getAllPricingPlans(){
        return this.productPricingPlanService.getAllPricingPlans();
    }
}
