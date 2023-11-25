package com.Products.ps.setup.controller;

import com.Products.ps.models.common.ResultSet;
import com.Products.ps.models.common.ServiceResult;
import com.Products.ps.models.setup.Country;
import com.Products.ps.models.setup.Lookup;
import com.Products.ps.setup.Impl.CountryDaoImpl;
import com.Products.ps.setup.api.LookupService;
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
