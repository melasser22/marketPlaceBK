package com.saas.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saas.products.model.ProductCss;
import com.saas.products.repositories.ProductCssRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductCssController {

	@Autowired
    private ProductCssRepository productCssRepository;
	
	@GetMapping("/product-css/{productCode}")
    @CrossOrigin(origins = "*")
    public List<ProductCss> getProductAssets(@PathVariable String productCode){
        return this.productCssRepository.findByproductCode(productCode);
    }
	
    @GetMapping("/product-css")
    @CrossOrigin(origins = "*")
    public List<ProductCss> findAll(){
        return this.productCssRepository.findAll();
    }
}
