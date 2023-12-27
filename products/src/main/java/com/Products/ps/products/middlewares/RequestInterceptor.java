package com.Products.ps.products.middlewares;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.product.Products;
import com.Products.ps.products.repositories.ProductsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestInterceptor implements HandlerInterceptor {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String apiKey = request.getHeader("apikey");
        String productCode= request.getParameter("productCode");
        if (apiKey != null) {
        	Products product = productsRepository.findByproductCode(productCode);
            if (product != null) {
            	String apiKeyDb = product.getApiKey();
            	if (apiKeyDb.equals(apiKey)) {
            		// Key is valid, proceed with the request
            		return true;
               }
            }
        }
        // Invalid key, return unauthorized
        respondUnauthorized(response, "Unauthorized Request");
        return false;
    }
    
    private void respondUnauthorized(HttpServletResponse response, String errorMessage) throws IOException {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json");
        ServiceResult<String> res = new ServiceResult<String>();
        HashMap<String, String> paramMap=new HashMap<String, String>();
		Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;
        
		paramMap.put("P_RQ_ID",randomNum.toString());
		
        res.setStatusCode(Integer.toString(HttpServletResponse.SC_UNAUTHORIZED));
        res.setReturnedObject(errorMessage);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResponse = objectMapper.writeValueAsString(res);

        response.getWriter().write(jsonResponse);
        response.getWriter().flush();
    }
}
