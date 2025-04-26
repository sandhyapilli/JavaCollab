package com.example.employeeLeaveManagement.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//Employee table
@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long employeeId;

private String firstName;
private String lastName;
@Column(unique=true, nullable=false)
private String email;
private String phoneNumber;
private String department;
private LocalDate JoiningDate;
@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
private List<LeaveRequest> leaveRequests;
@ManyToOne
@JoinColumn(name="managerId", nullable=false)
private Manager manager;

public Employee(Long employeeId, String firstName, String lastName, String email, String phoneNumber, String department,
		LocalDate joiningDate, List<LeaveRequest> leaveRequests, Manager manager) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.department = department;
	this.JoiningDate = joiningDate;
	this.leaveRequests = leaveRequests;
	this.manager = manager;
}

public List<LeaveRequest> getLeaveRequests() {
	return leaveRequests;
}

public void setLeaveRequests(List<LeaveRequest> leaveRequests) {
	this.leaveRequests = leaveRequests;
}

public Manager getManager() {
	return manager;
}

public void setManager(Manager manager) {
	this.manager = manager;
}

public Employee() {
	super();
}



public Long getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public LocalDate getJoiningDate() {
	return JoiningDate;
}
public void setJoiningDate(LocalDate JoiningDate) {
	this.JoiningDate = JoiningDate;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
			+ email + ", phoneNumber=" + phoneNumber + ", department=" + department + ", JoiningDate=" + JoiningDate
			+ ", leaveRequests=" + leaveRequests + ", manager=" + manager + "]";
}
}
