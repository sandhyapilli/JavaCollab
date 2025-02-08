package com.example.sim;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SimPlanRepository extends JpaRepository<SimPlanEntity, Long> {
//@Query("SELECT p FROM SimPlanEntity p WHERE"+
//"(:minprice IS NULL OR p.price >=:minprice) AND" +
//"(:maxprice IS NULL OR p.price <=:maxprice) AND" +
//"(:validity IS NULL OR p.validity=:validity)")
//List<SimPlanEntity> findByFilters(@Param("minprice") Double minprice, 
//        @Param("maxprice") Double maxprice, 
//        @Param("validity") Integer validity);
	
	@Query("SELECT p FROM SimPlanEntity p WHERE(:planType IS  NULL OR p.planType=:planType)")
	List<SimPlanEntity> findByPlanType(@Param("planType") String planType);
}
