package com.datawarehouse.DatawarehouseAPIs.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.datawarehouse.DatawarehouseAPIs.entity.WeatherFact;

@Repository
public interface WeatherFactResponsitory extends JpaRepository<WeatherFact, String>{
	
	@Query("select w from WeatherFact w where w.deleted = 0 and updated = 0")
	List<WeatherFact> findAll();
}
