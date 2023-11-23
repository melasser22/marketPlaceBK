package com.Ebilling.ps.setup.repositories;

import com.Ebilling.ps.models.setup.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {

    City findByCityCd(String cityCode);

}
