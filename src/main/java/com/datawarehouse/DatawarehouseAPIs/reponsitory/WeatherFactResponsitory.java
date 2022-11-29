package com.datawarehouse.DatawarehouseAPIs.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.datawarehouse.DatawarehouseAPIs.entity.WeatherFact;

@Repository
public interface WeatherFactResponsitory extends JpaRepository<WeatherFact, String>{
	
	@Query("select w from WeatherFact w where w.deleted = 0 and w.updated = 0 and w.timeExpried = '9999-12-31'")
	List<WeatherFact> findAll();
	
	@Query("select w from WeatherFact w where w.deleted = 0 and w.updated = 0 and w.timeExpried = '9999-12-31' and naturalKey = ?1")
	WeatherFact getById(String id);
}
