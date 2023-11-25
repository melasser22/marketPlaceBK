package com.Products.ps.products.controllers;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductAsset;
import com.Products.ps.products.api.ProductAssetService;
import com.Products.ps.products.repositories.ProductAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductAssetController {
	@Autowired
    private ProductAssetService productAssetService;
    @GetMapping("/get-product-assets")
    @CrossOrigin(origins = "*")
    public ServiceResult<ResultSet<ProductAsset>> getProductAssets(String productCode){
        return this.productAssetService.getProductAssets(productCode);
    }
    
}
