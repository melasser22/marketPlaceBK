package com.Ebilling.ps.setup.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Ebilling.ps.models.common.ResultSet;
import com.Ebilling.ps.models.common.ServiceResult;
import com.Ebilling.ps.models.setup.SystemParameter;
import com.Ebilling.ps.setup.api.SystemParametersService;



@RestController
@RequestMapping("/api/v1")
public class SystemParametersController {

	
    @Autowired
    private SystemParametersService systemParametersService;

	  
	 @GetMapping("/getSysParamsByModule")
	 @CrossOrigin(origins = "*")
	    public ServiceResult<ResultSet<SystemParameter>>getSystemParametersByModule(String SPD_Module) 
	   {
	        return systemParametersService.getSystemParametersByModule(SPD_Module);
	    }
	 
	 
	 @GetMapping("/getSystemParametersByNAME")
	 @CrossOrigin(origins = "*")
	    public ServiceResult<ResultSet<SystemParameter>> getSystemParametersByNAME(String SPQ_NAME) {
	        return systemParametersService.getSystemParametersByNAME(SPQ_NAME);
	    }
	 
	 @GetMapping("/getSystemParametersByID")
	 @CrossOrigin(origins = "*")
	    public ServiceResult<ResultSet<SystemParameter>> getSystemParametersByNAME(Number SPQ_ID) {
	        return systemParametersService.getSystemParametersByID(SPQ_ID);
	    }
}
