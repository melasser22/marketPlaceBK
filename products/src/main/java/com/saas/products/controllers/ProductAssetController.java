package com.saas.products.controllers;

import com.saas.products.model.ProductAsset;
import com.saas.products.repositories.ProductAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductAssetController {
	@Autowired
    private ProductAssetRepository productAssetRepository;
    @GetMapping("/product-assets/{productCode}")
    @CrossOrigin(origins = "*")
    public List<ProductAsset> getProductAssets(@PathVariable String productCode){
        return this.productAssetRepository.findByproductCode(productCode);
    }
    @GetMapping("/product-assets")
    @CrossOrigin(origins = "*")
    public List<ProductAsset> findAll(){
        return this.productAssetRepository.findAll();
    }
}
