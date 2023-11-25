package com.Products.ps.setup.Intf;


import com.Products.ps.models.setup.Country;

import java.util.List;

public interface CountryDao {

    public Country getCountryByID(Long countryID);

    public Country getCountryByCode(String countryCode);

    public List<Country> getAllCountries();
}
