package com.Products.ps.setup.Intf;


import com.Products.ps.models.setup.City;

import java.util.List;

public interface CityDao {

    public City getCityByCityCode(String cityCode);

    public City getCityById(Long cityId);

    public List<City> getAllCities();

}

