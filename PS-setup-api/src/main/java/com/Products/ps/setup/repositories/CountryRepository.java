package com.Products.ps.setup.repositories;

import com.Products.ps.models.setup.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    public Country findByCountryCd(String countryCode);


}
