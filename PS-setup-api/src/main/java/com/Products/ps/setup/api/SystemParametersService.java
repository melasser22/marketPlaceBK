package com.Products.ps.setup.api;


import org.springframework.stereotype.Service;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.setup.Resources;
import com.Products.ps.models.setup.SystemParameter;
import com.Products.ps.setup.repositories.SystemParametersRepository;
import com.Products.ps.setup.util.CryptoUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@Service
public class SystemParametersService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SystemParametersService.class);
	
    @Autowired 
    private SystemParametersRepository systemParametersRepository;
    
    private CryptoUtils cryptoUtils;

    
    // Get all system Parameters
    public ServiceResult<ResultSet<SystemParameter>> getSystemParametersByModule(String SPD_Module) {
		Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;
        
    	ServiceResult<ResultSet<SystemParameter>> result =new ServiceResult<ResultSet<SystemParameter>>();
		//*************************Params**************************
		result.setStatusCode(HttpStatus.OK.toString());

    	result.setRqUID(randomNum.toString());
			try{
				//create ResultSet object and set its parameters
				ResultSet<SystemParameter> resultSet= new ResultSet<SystemParameter>();
				List<SystemParameter> systemParametersList = systemParametersRepository.getSystemParametersByModule(SPD_Module);
				for(SystemParameter systemParam:systemParametersList) {
					systemParam.setSp_module(CryptoUtils.encrypt(systemParam.getSp_module()));
					systemParam.setSp_name(CryptoUtils.encrypt(systemParam.getSp_name()));
					systemParam.setSp_value(CryptoUtils.encrypt(systemParam.getSp_value()));
				}

				resultSet.setReturnedList(systemParametersRepository.getSystemParametersByModule(SPD_Module));
				result.setReturnedObject(resultSet);
				
			}catch(Exception e){
		    	e.printStackTrace();

				LOGGER.error("Exception while getting system params list by module");
				LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
				result.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
				result.setDebugId(randomNum+"");
			}
		return result;
        
        

    }
    
    // Get all system Parameters
    public ServiceResult<ResultSet<SystemParameter>> getSystemParametersByNAME(String SPQ_NAME) {

    	ServiceResult<ResultSet<SystemParameter>> result =new ServiceResult<ResultSet<SystemParameter>>();
		//*************************Params**************************
		HashMap<String, String> paramMap=new HashMap();
		paramMap.put("P_RQ_ID","x123");
		
		
			
			try{
				//create ResultSet object and set its parameters
				ResultSet<SystemParameter> resultSet= new ResultSet<SystemParameter>();
			//	resultSet.setReturnedList(systemParametersRepository.getSystemParametersByNAME(SPQ_NAME));
				result.setReturnedObject(resultSet);
				
			}catch(Exception e){
				e.printStackTrace();
				Random randomGenerator = new Random();
		        int maximum = 999999999;//largest number of 9 digits
		        int minimum = 100000000;//smallest number of 9 digits
		        Integer randomNum = null;
		        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;
		        
				LOGGER.error("Exception while getting system params list by module");
				LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
				result.setStatusCode("E299995");
				result.setDebugId(randomNum+"");
			}
		return result;
        

    }
    
    // Get all system Parameters
    public ServiceResult<ResultSet<SystemParameter>> getSystemParametersByID(Number SPQ_ID){
    //    return systemParametersRepository.getSystemParametersByID(SPQ_ID);
return null;
    }

}
