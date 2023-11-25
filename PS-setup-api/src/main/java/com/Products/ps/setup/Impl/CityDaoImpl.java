package com.Products.ps.setup.Impl;


import com.Products.ps.models.setup.City;
import com.Products.ps.setup.Intf.CityDao;
import com.Products.ps.setup.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    private CityRepository repo;

    @Override
    public City getCityByCityCode(String cityCode) {
        return repo.findByCityCd(cityCode);
    }

    @Override
    public City getCityById(Long cityId) {
        return repo.findById(cityId).get();
    }

    @Override
    public List<City> getAllCities() {
        return repo.findAll();
    }


}
