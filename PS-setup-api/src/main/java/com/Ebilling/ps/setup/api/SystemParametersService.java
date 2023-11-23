package com.Ebilling.ps.setup.api;


import org.springframework.stereotype.Service;

import com.Ebilling.ps.models.common.ResultSet;
import com.Ebilling.ps.models.common.ServiceResult;
import com.Ebilling.ps.models.setup.SystemParameter;
import com.Ebilling.ps.setup.repositories.SystemParametersRepository;

import java.util.HashMap;
import java.util.Random;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SystemParametersService {
	private static final Logger LOGGER = LoggerFactory.getLogger(SystemParametersService.class);
	
    @Autowired 
    private SystemParametersRepository systemParametersRepository;
    
    
    // Get all system Parameters
    public ServiceResult<ResultSet<SystemParameter>> getSystemParametersByModule(String SPD_Module) {
		Random randomGenerator = new Random();
        int maximum = 999999999;//largest number of 9 digits
        int minimum = 100000000;//smallest number of 9 digits
        Integer randomNum = null;
        randomNum = randomGenerator.nextInt((maximum - minimum) + 1) + minimum;
        
    	ServiceResult<ResultSet<SystemParameter>> result =new ServiceResult<ResultSet<SystemParameter>>();
		//*************************Params**************************
    	result.setStatusCode("200");

    	result.setRqUID(randomNum.toString());
			try{
				//create ResultSet object and set its parameters
				ResultSet<SystemParameter> resultSet= new ResultSet<SystemParameter>();
				resultSet.setReturnedList(systemParametersRepository.getSystemParametersByModule(SPD_Module));
				result.setReturnedObject(resultSet);
				
			}catch(Exception e){
		    	e.printStackTrace();

				LOGGER.error("Exception while getting system params list by module");
				LOGGER.error(e.toString() + ">>>" + e.getMessage(), e);
				result.setStatusCode("E299995");
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
