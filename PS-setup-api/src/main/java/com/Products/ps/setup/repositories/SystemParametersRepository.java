package com.Products.ps.setup.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Products.ps.models.setup.SystemParameter;

@Repository

public interface SystemParametersRepository extends JpaRepository<SystemParameter, Long> {

	

	@Query(value = "SELECT * FROM SYSTEM_PARAMETERS t WHERE t.sp_module = ?1", nativeQuery = true)
	List<SystemParameter> getSystemParametersByModule(String SPD_Module);
	
	@Query(value = "SELECT * FROM SYSTEM_PARAMETERS t WHERE t.sp_name = ?1", nativeQuery = true)
	SystemParameter getSystemParametersByNAME(String SPQ_NAME);
	
	@Query(value = "SELECT * FROM SYSTEM_PARAMETERS t WHERE t.sp_id = ?1", nativeQuery = true)
	SystemParameter getSystemParametersByID(Number SPQ_ID);
}