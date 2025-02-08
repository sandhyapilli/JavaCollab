package com.example.sim;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plans")
public class SimPlanController {
	private static final Logger logger=LoggerFactory.getLogger(SimPlanController.class);
@Autowired
private SimPlanService planService;
//@GetMapping("/getPlan")
//public ResponseEntity<List<SimPlanEntity>> getAllDetails( @RequestParam(required = false, defaultValue = "price") String sortfield,
//        @RequestParam(required = false, defaultValue = "asc") String sortDirection){
//	List<SimPlanEntity> simList=planService.getAllPlans(sortfield,sortDirection);
//	return ResponseEntity.ok(simList);
//}
@GetMapping("/getPlan")
public ResponseEntity<List<SimPlanEntity>> getAllDetails(@RequestParam(required=false) String PlanType){
	logger.info("getting the details based on plantype"+PlanType);
	logger.error("details are not getting properly"+PlanType);
	logger.trace("get the detailed information"+PlanType);
	List<SimPlanEntity> details=planService.getAllPlans(PlanType);
	return ResponseEntity.ok(details);
	
}
@GetMapping("/getById/{id}")
public ResponseEntity<SimPlanEntity> getById(@PathVariable Long id){
	SimPlanEntity plan=planService.getById(id);
	return ResponseEntity.ok(plan);
	
}
@PostMapping("/create/plan")
	public ResponseEntity CreatePlan(@RequestBody SimPlanEntity plan) {
	SimPlanEntity plaan=planService.createPlans(plan);
		return ResponseEntity.status(201).body(plaan);
	}
@PutMapping("/update/plan")
public ResponseEntity updatePlan(@PathVariable Long id,@RequestBody SimPlanEntity plan) {
	 SimPlanEntity updated = planService.updatePlan(id, plan);
     return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
 }
//@GetMapping("/search")
//public List<SimPlanEntity> searchPlans(@RequestParam(required=false) Double minprice,
//		                               @RequestParam(required=false) Double maxprice, 
//		                               @RequestParam(required=false) Integer validity) {
//	List<SimPlanEntity> plansSearch=planService.searchPlan(minprice, maxprice, validity);
//	return plansSearch;
//	
//}
}

