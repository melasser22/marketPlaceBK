package com.Ebilling.ps.setup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Ebilling.ps.models.setup.Resources;
import com.Ebilling.ps.models.setup.SystemParameter;

@Repository

public interface ResourcesRepository  extends JpaRepository<Resources, Long> {

	

	@Query(value = "SELECT * FROM  FE_RESOURCES ", nativeQuery = true)
	List<Resources> getResourcesByLang(String Lang);
	
}