package com.Products.ps.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductCss;
import com.Products.ps.models.setup.SystemParameter;
import com.Products.ps.products.api.ProductCssService;
import com.Products.ps.products.api.ProductPricingPlanService;
import com.Products.ps.products.repositories.ProductCssRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductCssController {

	@Autowired
    private ProductCssService productCssService;
	
	@GetMapping("/get_product-css_files")
    @CrossOrigin(origins = "*")
    public ServiceResult<ProductCss> getProductCssFiles( String productCode){
        return this.productCssService.getProductCssFiles(productCode);
    }
	
	
}
