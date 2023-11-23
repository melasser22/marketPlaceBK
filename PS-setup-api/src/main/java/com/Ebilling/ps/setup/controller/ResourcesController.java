package com.Ebilling.ps.setup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ebilling.ps.models.common.ResultSet;
import com.Ebilling.ps.models.common.ServiceResult;
import com.Ebilling.ps.models.setup.Resources;
import com.Ebilling.ps.setup.api.ResourcesService;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ResourcesController {

	
    @Autowired
    private ResourcesService resourcesService;

	  
	 @GetMapping("/AppResources")
	 @CrossOrigin(origins = "*")
	    public  ResponseEntity<Map<String, String>> getResourcesByLang(String Lang)
	   {
	        return resourcesService.getResourcesByLang(Lang);
	    }

}
