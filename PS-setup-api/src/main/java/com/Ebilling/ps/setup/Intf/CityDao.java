package com.Ebilling.ps.setup.Intf;


import com.Ebilling.ps.models.setup.City;

import java.util.List;

public interface CityDao {

    public City getCityByCityCode(String cityCode);

    public City getCityById(Long cityId);

    public List<City> getAllCities();

}

