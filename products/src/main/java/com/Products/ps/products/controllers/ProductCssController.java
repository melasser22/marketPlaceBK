package com.Products.ps.products.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductCss;
import com.Products.ps.products.api.ProductCssService;

@RestController
@RequestMapping("/api/v1")
public class ProductCssController {

	@Autowired
    private ProductCssService productCssService;
	
	@GetMapping("/get-product-css-files")
    @CrossOrigin(origins = "*")
    public ServiceResult<ProductCss> getProductCssFiles( String productCode){
        return this.productCssService.getProductCssFiles(productCode);
    }
	
	
}
