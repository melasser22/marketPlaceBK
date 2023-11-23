package com.Ebilling.ps.setup.Impl;


import com.Ebilling.ps.models.setup.City;
import com.Ebilling.ps.setup.Intf.CityDao;
import com.Ebilling.ps.setup.repositories.CityRepository;
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
