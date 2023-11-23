package com.Ebilling.ps.setup.controller;

import com.Ebilling.ps.models.setup.City;
import com.Ebilling.ps.setup.Impl.CityDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CityController {

    @Autowired
    private CityDaoImpl cityDaoImpl;


    @GetMapping("/getCityList")
    @CrossOrigin(origins = "*")
    public List<City> getAllCities()
    {
        return cityDaoImpl.getAllCities();
    }

}
