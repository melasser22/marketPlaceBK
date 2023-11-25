package com.Products.ps.setup.repositories;

import com.Products.ps.models.setup.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

    City findByCityCd(String cityCode);

}
