package com.Products.ps.products.controllers;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductCss;
import com.Products.ps.models.product.ProductTermsPrivacy;
import com.Products.ps.products.api.ProductCssService;
import com.Products.ps.products.api.ProductTermsPrivacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class ProductTermsPrivacyController {

    @Autowired
    private ProductTermsPrivacyService productTermsPrivacyService;

    @GetMapping("/get-product-terms-privacy-content")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductTermsPrivacy>> getProductTermsPrivacyContent(String productCode){
        return this.productTermsPrivacyService.getProductTermsPrivacyContent(productCode);
    }


}
