package com.Ebilling.ps.setup.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import com.Ebilling.ps.models.setup.Resources;
import com.Ebilling.ps.setup.repositories.ResourcesRepository;

@Service
public class ResourcesService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SystemParametersService.class);
	
    @Autowired 
    private ResourcesRepository resourcesRepository;
    
    
    // Get all Resources by Language
    public ResponseEntity<Map<String, String>> getResourcesByLang(String Lang) {
		Map<String,String> translateObj=new HashMap<String, String>();

				try{
					List<Resources> resoucesList = resourcesRepository.getResourcesByLang(Lang);
					for(Resources resource:resoucesList) {
						translateObj.put(resource.getFr_key(), Lang.equalsIgnoreCase("en")?resource.getFr_value_en():resource.getFr_value_ar());
					}
				
			}catch(Exception e){
				e.printStackTrace();
				return new ResponseEntity<Map<String, String>>(translateObj,new HttpHeaders(), HttpStatus.EXPECTATION_FAILED);
					
			}
				return new ResponseEntity<Map<String, String>>(translateObj,new HttpHeaders(), HttpStatus.OK);
        
        

    }
}
