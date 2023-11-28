package com.Products.ps.products.controllers;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductFaq;
import com.Products.ps.products.api.ProductFaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class ProductFaqController {
	@Autowired
    private ProductFaqService productFaqService;
    @GetMapping("/get-product-faqs")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductFaq>> getProductFaqs(String productCode){
        return this.productFaqService.getProductFaqs(productCode);
    }
    
}