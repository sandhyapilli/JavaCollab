package com.example.employeeLeaveManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeLeaveManagement.DTO.ManagerDTO;
import com.example.employeeLeaveManagement.service.ManagerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private ManagerService managerS;
	
@PostMapping("/register")	
public ManagerDTO Register(@Valid @RequestBody ManagerDTO manager) {
	ManagerDTO result=managerS.Register(manager);
	return result;
}
@GetMapping("/getAll")
public List<ManagerDTO> getAllDetails() {
	return managerS.getAll();
}
}
