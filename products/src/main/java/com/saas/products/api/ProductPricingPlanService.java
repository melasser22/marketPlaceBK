package com.saas.products.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.saas.products.model.ProductPricingPlan;
import com.saas.products.model.ProductPricingPlanDetail;
import com.saas.products.repositories.ProductPricingPlanRepository;

@Service
public class ProductPricingPlanService {
	@Autowired
	 private ProductPricingPlanRepository productPricingPlanRepository;
	
	public List<ProductPricingPlan> getProductAssets(String productCode){
		List<ProductPricingPlan> allPlans = this.productPricingPlanRepository.findByproductCodeWithDetails(productCode);
		for(int i=0; i<allPlans.size(); i++) {
			System.out.println(allPlans.get(i).toString());
		}
		
		return allPlans;
    }
	public List<ProductPricingPlan> getAllPricingPlans(){
        return this.productPricingPlanRepository.findAll();
    }
}
