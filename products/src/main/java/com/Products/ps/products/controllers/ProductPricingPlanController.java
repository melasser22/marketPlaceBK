package com.Products.ps.products.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductPricingPlan;
import com.Products.ps.products.api.ProductPricingPlanService;
import com.Products.ps.products.repositories.ProductPricingPlanRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductPricingPlanController {

	@Autowired
    private ProductPricingPlanService productPricingPlanService;
	
	@GetMapping("/product-pricing-list/{productCode}")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductPricingPlan>> getProductPricingPlan(@PathVariable String productCode){
        return this.productPricingPlanService.getProductPricingPlan(productCode);
    }
	
    @GetMapping("/product-pricing-list")
    @CrossOrigin(origins = "*")
    public List<ProductPricingPlan> getAllPricingPlans(){
        return this.productPricingPlanService.getAllPricingPlans();
    }
}
