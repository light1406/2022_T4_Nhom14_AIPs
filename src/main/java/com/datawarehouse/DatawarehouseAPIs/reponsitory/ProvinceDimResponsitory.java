package com.datawarehouse.DatawarehouseAPIs.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datawarehouse.DatawarehouseAPIs.entity.ProvinceDim;

public interface ProvinceDimResponsitory extends JpaRepository<ProvinceDim, String>{

}
