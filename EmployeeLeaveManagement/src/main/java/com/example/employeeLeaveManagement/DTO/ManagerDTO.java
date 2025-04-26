package com.example.employeeLeaveManagement.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class ManagerDTO {
	private Integer managerId; 
	@NotNull(message="managerName should not be null")
	private String managerName;
	@NotNull(message=" email should not be empty")
	@Email
	private String email; 
	@NotNull(message="department should not be null")
	private String department; //(String, Not Null)
	public ManagerDTO(int managerId, @NotNull(message = "managerName should not be null") String managerName,
			@NotNull(message = " email should not be empty") @Email String email,
			@NotNull(message = "department should not be null") String department) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.email = email;
		this.department = department;
	}

	@Override
	public String toString() {
		return "ManagerDTO [managerId=" + managerId + ", managerName=" + managerName + ", email=" + email
				+ ", department=" + department + "]";
	}

	public ManagerDTO() {
		super();
	}

	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
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
}
