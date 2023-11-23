package com.saas.products.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saas.products.api.ProductPricingPlanService;
import com.saas.products.model.ProductPricingPlan;
import com.saas.products.model.ProductPricingPlanDetail;
import com.saas.products.repositories.ProductPricingPlanRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductPricingPlanController {

	@Autowired
    private ProductPricingPlanService productPricingPlanService;
	
	@GetMapping("/product-pricing-list/{productCode}")
    @CrossOrigin(origins = "*")
    public List<ProductPricingPlan> getProductAssets(@PathVariable String productCode){
        return this.productPricingPlanService.getProductAssets(productCode);
    }
	
    @GetMapping("/product-pricing-list")
    @CrossOrigin(origins = "*")
    public List<ProductPricingPlan> getAllPricingPlans(){
        return this.productPricingPlanService.getAllPricingPlans();
    }
}
