package com.datawarehouse.DatawarehouseAPIs.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datawarehouse.DatawarehouseAPIs.entity.DateDim;

public interface DateDimReponsitory extends JpaRepository<DateDim, String>{

}
