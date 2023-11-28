package com.Products.ps.products.controllers;

import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductContactForm;
import com.Products.ps.products.api.ProductContactService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1")

public class ProductContactController {
    @Autowired
    private ProductContactService productContactService;
@Transactional
    @PostMapping("/submit-contact-form")
    @CrossOrigin(origins = "*")
    public ServiceResult<ProductContactForm> addContact(@RequestBody ProductContactForm productContactForm){
//    productContactForm.setMessageDate(new Date());

        return   this.productContactService.addContact(productContactForm);

    }
}
