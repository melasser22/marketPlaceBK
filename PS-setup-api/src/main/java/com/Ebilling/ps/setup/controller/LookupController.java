package com.Ebilling.ps.setup.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ebilling.ps.models.common.ResultSet;
import com.Ebilling.ps.models.common.ServiceResult;
import com.Ebilling.ps.models.setup.Lookup;
import com.Ebilling.ps.setup.api.LookupService;

@RestController
@RequestMapping("/api/v1")
public class LookupController {

	@Autowired
    private LookupService LookupService;

	
	  
		 @GetMapping("/getLookupList")
		 @CrossOrigin(origins = "*")
		    public ServiceResult<ResultSet<Lookup>>getCountries() 
		   {
		        return LookupService.getCountries();
		    }
}
