package com.Products.ps.products.api;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.ProductCss;
import com.Products.ps.products.repositories.ProductCssRepository;

@Service
public class ProductCssService {


	@Autowired
    private ProductCssRepository productCssRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductPricingPlanService.class);


		public  ServiceResult<ProductCss>getProductCssFiles(String productCode){
			ServiceResult<ProductCss> result =new ServiceResult<ProductCss>();
			HashMap<String, String> paramMap=new HashMap();
			Random randomGenerator = new Random();
	        int maximum = 999999999;//largest number of 9 digits
	        int minimum = 100000000;//smallest number of 9 digits
	        Integer randomNum = null;
	        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;
	        
			paramMap.put("P_RQ_ID",randomNum.toString());
			result.setStatusCode(HttpStatus.OK.toString());
					try{
						ProductCss productCss = this.productCssRepository.findByproductCode(productCode);
						result.setReturnedObject(productCss);

						
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
