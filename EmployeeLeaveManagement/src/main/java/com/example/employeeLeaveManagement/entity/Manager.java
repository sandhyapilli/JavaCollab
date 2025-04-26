package com.example.employeeLeaveManagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer managerId; 
	private String managerName;// (String, Not Null)
	private String email; //(String, Unique, Not Null)
	private String department; //(String, Not Null)
	@OneToMany(mappedBy="manager",cascade=CascadeType.ALL)
	private List<Employee> employee;
	public Manager(Integer managerId, String managerName, String email, String department) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.email = email;
		this.department = department;
	}
	public Manager() {
		super();
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", email=" + email + ", department="
				+ department + "]";
	}

}
