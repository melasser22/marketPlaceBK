package com.Products.ps.products.controllers;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductFaq;
import com.Products.ps.models.product.Products;
import com.Products.ps.products.api.ProductFaqService;
import com.Products.ps.products.api.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductsController {
    @Autowired
    private ProductsService productsService;
    @GetMapping("/get-products-by-code")
    @CrossOrigin(origins = "*")
    public ServiceResult<Products> getProductByCode(String productCode){
        return this.productsService.getProductByCode(productCode);
    }

    @GetMapping("/get-available-products")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<Products>> findAvailableProducts(){
        return this.productsService.findAvailableProducts();
    }
}