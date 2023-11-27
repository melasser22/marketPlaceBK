package com.Products.ps.products.api;

import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductContactForm;
import com.Products.ps.models.product.ProductCss;
import com.Products.ps.products.repositories.ProductContactFormRepository;
import com.Products.ps.products.repositories.ProductCssRepository;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Random;

@Service
public class ProductContactService {

    @Autowired
    private ProductContactFormRepository productContactFormRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductContactService.class);

    @Transactional
    public  ServiceResult<ProductContactForm>addContact(ProductContactForm productContactForm){
        ServiceResult<ProductContactForm> result =new ServiceResult<ProductContactForm>();
        HashMap<String, String> paramMap=new HashMap();
        Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;

        paramMap.put("P_RQ_ID",randomNum.toString());
        result.setStatusCode(HttpStatus.CREATED.toString());
        try{
            ProductContactForm productContactFormResponse = this.productContactFormRepository.save(productContactForm);
            result.setReturnedObject(productContactFormResponse);


        }catch(Exception e){
            e.printStackTrace();
            LOGGER.error("Exception while getting Lookup list by module");
            LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
            result.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
            result.setDebugId(randomNum+"");
        }
        return result;
    }


//    public ProductContactForm addContact(ProductContactForm productContactForm){
//        return this.productContactFormRepository.save(productContactForm);
//    }
}
