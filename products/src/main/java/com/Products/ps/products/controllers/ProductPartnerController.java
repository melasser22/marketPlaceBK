package com.Products.ps.products.controllers;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductPartner;
import com.Products.ps.products.api.ProductPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class ProductPartnerController {
	@Autowired
    private ProductPartnerService productPartnerService;
    @GetMapping("/get-product-partners")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductPartner>> getProductPartners(String productCode){
        return this.productPartnerService.getProductPartners(productCode);
    }
    
}
