package com.Ebilling.ps.setup.controller;

import com.Ebilling.ps.models.common.ResultSet;
import com.Ebilling.ps.models.common.ServiceResult;
import com.Ebilling.ps.models.setup.Country;
import com.Ebilling.ps.models.setup.Lookup;
import com.Ebilling.ps.setup.Impl.CountryDaoImpl;
import com.Ebilling.ps.setup.api.LookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CountryController {
    @Autowired
    private CountryDaoImpl countryDaoImpl;


    @GetMapping("/getCountryList")
    @CrossOrigin(origins = "*")
    public List<Country> getAllCountries()
    {
        return countryDaoImpl.getAllCountries();
    }
}
