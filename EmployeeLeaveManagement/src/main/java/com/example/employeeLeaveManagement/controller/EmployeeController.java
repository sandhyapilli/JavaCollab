package com.example.employeeLeaveManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeLeaveManagement.DTO.EmployeeDTO;
import com.example.employeeLeaveManagement.serviceImpl.EmployeeServiceImpl;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/emp/leave")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl empService;
	@PostMapping("/apply")
  public ResponseEntity<EmployeeDTO> createEmployee(@Valid @RequestBody EmployeeDTO empDTO){
	  EmployeeDTO saveEmp= empService.createEmployee(empDTO);
	  return ResponseEntity.status(HttpStatus.CREATED).body(saveEmp);
  }
	@GetMapping("/getById/{id}")
	public EmployeeDTO getById(@PathVariable("id") Long employeeId) {
		EmployeeDTO details=empService.getEmployeeById(employeeId);
		return details;
	}
	@GetMapping("getByEmail/{email}")
	public EmployeeDTO getByEmail(@PathVariable String email) {
		EmployeeDTO details=empService.getEmployeeByEmail(email);
		return details;
	}
	@GetMapping("/getAllDetails")
	public List<EmployeeDTO> getAllDetails() {
		return empService.getAllEmployees();
	}
	@PutMapping("/update/{Id}")
	public EmployeeDTO updateById(@Valid @PathVariable("Id") Long employeeId, @RequestBody EmployeeDTO employeeDTO) {
		EmployeeDTO emp=empService.updateEmployee(employeeId, employeeDTO);
		return emp;
	}
	@DeleteMapping("/deleteId/{Id}")
	public ResponseEntity<String> deleteById(@PathVariable("Id") Long employeeId) {
		return empService.deleteById(employeeId);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		return empService.deleteEmployee();
	}
}
