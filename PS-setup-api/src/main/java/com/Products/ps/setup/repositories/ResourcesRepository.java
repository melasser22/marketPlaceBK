package com.Products.ps.setup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Products.ps.models.setup.Resources;
import com.Products.ps.models.setup.SystemParameter;

@Repository

public interface ResourcesRepository  extends JpaRepository<Resources, Long> {

	

	@Query(value = "SELECT * FROM  FE_RESOURCES ", nativeQuery = true)
	List<Resources> findAll();
	
}