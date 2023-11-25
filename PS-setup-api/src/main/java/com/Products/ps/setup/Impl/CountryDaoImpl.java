package com.Products.ps.setup.Impl;


import com.Products.ps.models.setup.Country;
import com.Products.ps.setup.Intf.CountryDao;
import com.Products.ps.setup.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDaoImpl implements CountryDao {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Country getCountryByID(Long countryID) {
        return countryRepository.getOne(countryID);
    }

    @Override
    public Country getCountryByCode(String countryCode) {
        return countryRepository.findByCountryCd(countryCode);
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }


}
