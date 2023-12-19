package com.Products.ps.products.api;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.Products;
import com.Products.ps.products.repositories.ProductsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCssService.class);

    public ServiceResult<Products> getProductByCode(String productCode){
        ServiceResult<Products> result =new ServiceResult<Products>();
        HashMap<String, String> paramMap=new HashMap();
        Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;

        paramMap.put("P_RQ_ID",randomNum.toString());
        result.setStatusCode(HttpStatus.OK.toString());
        try{
            Products product = this.productsRepository.findByproductCode(productCode);
            result.setReturnedObject(product);
        }catch(Exception e){
            e.printStackTrace();
            LOGGER.error("Exception while getting Lookup list by module");
            LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
            result.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
            result.setDebugId(randomNum+"");
        }
        return result;
    }
    public ServiceResult<Products> getProductBySaasId(Long saasProductId){
        ServiceResult<Products> result =new ServiceResult<Products>();
        HashMap<String, String> paramMap=new HashMap();
        Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;

        paramMap.put("P_RQ_ID",randomNum.toString());
        result.setStatusCode(HttpStatus.OK.toString());
        try{
            Products product = this.productsRepository.findBysaasProductId(saasProductId);
            result.setReturnedObject(product);
        }catch(Exception e){
            e.printStackTrace();
            LOGGER.error("Exception while getting Lookup list by module");
            LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
            result.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
            result.setDebugId(randomNum+"");
        }
        return result;
    }

    public ServiceResult<ResultSet<Products>> findAllAvailableProducts(){
        ServiceResult<ResultSet<Products>> result =new ServiceResult<ResultSet<Products>>();
        ResultSet<Products> resultSet= new ResultSet<Products>();
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
            resultSet.setReturnedList(this.productsRepository.findAllAvailableProducts());
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
