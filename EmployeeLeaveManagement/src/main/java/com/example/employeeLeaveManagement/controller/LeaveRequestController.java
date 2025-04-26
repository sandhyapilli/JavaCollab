package com.example.employeeLeaveManagement.controller;

import java.util.List;

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

import com.example.employeeLeaveManagement.DTO.LeaveRequestDTO;
import com.example.employeeLeaveManagement.serviceImpl.LeaveServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/leave")
public class LeaveRequestController {
@Autowired
private LeaveServiceImpl leaveService;

@PostMapping("/apply")
public ResponseEntity<LeaveRequestDTO> createLeave(@Valid @RequestBody LeaveRequestDTO leaveDTO) {
	LeaveRequestDTO apply=leaveService.createEmployee(leaveDTO);
	return ResponseEntity.status(HttpStatus.OK).body(apply);
}
@GetMapping("/getAll")
public ResponseEntity<List<LeaveRequestDTO>> getAll(){
	List<LeaveRequestDTO> allDetails=leaveService.getAllDetails();
	return ResponseEntity.status(HttpStatus.OK).body(allDetails);
}
@GetMapping("getById/{id}")
public LeaveRequestDTO getById(@PathVariable("id") Integer LeaveId) {
	LeaveRequestDTO result=leaveService.getById(LeaveId);
	return result;
}
@PutMapping("/update/{LeaveId}")
public LeaveRequestDTO updateById(@Valid @PathVariable Integer LeaveId, @RequestBody LeaveRequestDTO leaveDTO) {
	LeaveRequestDTO leave=leaveService.updateById(LeaveId, leaveDTO);
	return leave;
}
@DeleteMapping("/delete")
public ResponseEntity<String> deleteAll() {
	leaveService.delteAll();
	return ResponseEntity.ok("Deleted successfully");
}
@DeleteMapping("/deleteById/{LeaveId}")
public ResponseEntity<String> deleteById(@PathVariable Integer LeaveId) {
	leaveService.deleteById(LeaveId);
	return ResponseEntity.ok("Deleted successfully"); // to client see the message like deleted and all we should give the message in controller class
}
}
