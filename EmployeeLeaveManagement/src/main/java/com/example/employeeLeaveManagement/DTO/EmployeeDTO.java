package com.example.employeeLeaveManagement.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EmployeeDTO {
	private Long employeeId;
	
	private Integer managerId; 
	
	@NotNull(message="first name should not be null")
	private String firstName;
    @NotNull(message="last name should not be null")
	private String lastName;
	@Email
	private String email;
	@Size(min=10, max=10,message="phone number length should be 10")
	private String phoneNumber;
	private String department;
	private LocalDate JoiningDate;
	public EmployeeDTO(Long employeeId, Integer managerId,
			@NotNull(message = "first name should not be null") String firstName,
			@NotNull(message = "last name should not be null") String lastName, @Email String email,
			@Size(min = 10, max = 10, message = "phone number length should be 10") String phoneNumber,
			String department, LocalDate joiningDate) {
		super();
		this.employeeId = employeeId;
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.department = department;
		JoiningDate = joiningDate;
	}
	public EmployeeDTO() {
		super();
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
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
			return "EmployeeDTO [employeeId=" + employeeId + ", managerId=" + managerId + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", department="
					+ department + ", JoiningDate=" + JoiningDate + "]";
		}
}
