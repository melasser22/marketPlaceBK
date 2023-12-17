package com.Products.ps.products.api;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductCss;
import com.Products.ps.models.product.ProductFaq;
import com.Products.ps.models.product.ProductTermsPrivacy;
import com.Products.ps.products.repositories.ProductTermsPrivacyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;



@Service
public class ProductTermsPrivacyService {


    @Autowired
    private ProductTermsPrivacyRepository productTermsPrivacyRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductTermsPrivacyService.class);


    public ServiceResult<ResultSet<ProductTermsPrivacy>> getProductTermsPrivacyContent(String productCode){
        ServiceResult<ResultSet<ProductTermsPrivacy>> result =new ServiceResult<ResultSet<ProductTermsPrivacy>>();
        ResultSet<ProductTermsPrivacy> resultSet= new ResultSet<ProductTermsPrivacy>();
        HashMap<String, String> paramMap=new HashMap();
        Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;

        paramMap.put("P_RQ_ID",randomNum.toString());
        result.setStatusCode(HttpStatus.OK.toString());
        result.setReturnedObject(resultSet);
        try{
            resultSet.setReturnedList(productTermsPrivacyRepository.findByproductCode(productCode));

        }catch(Exception e){
            e.printStackTrace();
            LOGGER.error("Exception while getting Lookup list by module");
            LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
            result.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
            result.setDebugId(randomNum+"");
        }
        return result;
    }

}
