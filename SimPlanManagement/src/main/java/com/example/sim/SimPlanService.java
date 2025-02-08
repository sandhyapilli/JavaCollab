package com.example.sim;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SimPlanService {
@Autowired
private SimPlanRepository planRepo;

public SimPlanEntity createPlans(SimPlanEntity planEntity) {
	return planRepo.save(planEntity);
}
public List<SimPlanEntity> getAllPlans(String planType){
	return planRepo.findByPlanType(planType);
}
//public List<SimPlanEntity> getAllPlans(String sortfield, String sortDirection){
//	Sort.Direction direction=sortDirection.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
//	Sort sort=Sort.by(direction, sortfield);
//	
//	return planRepo.findAll(sort);
//}
public SimPlanEntity getById(Long id) {
	return planRepo.findById(id).orElse(null);
}
public SimPlanEntity updatePlan(Long id,SimPlanEntity plan) {
	if(planRepo.existsById(id)) {
		plan.setId(id);
		return planRepo.save(plan);
	}return null;
}
public void deletePlan(SimPlanEntity plan) {
	 planRepo.delete(plan);
}
//public List<SimPlanEntity> searchPlan(double minprice,double maxprice,Integer validity){
//	List<SimPlanEntity> search=planRepo.findByFilters(minprice, maxprice, validity);
//	return search;
//}
}
