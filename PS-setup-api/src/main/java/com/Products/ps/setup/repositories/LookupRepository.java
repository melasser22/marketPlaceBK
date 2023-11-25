package com.Products.ps.setup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Products.ps.models.setup.Lookup;

public interface LookupRepository extends JpaRepository<Lookup, Long> {

	

	@Query(value = "SELECT * FROM  LOOKUPS ", nativeQuery = true)
	List<Lookup> getCountries();



}
