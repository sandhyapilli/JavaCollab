package com.example.employeeLeaveManagement.entity;

import java.time.LocalDate;
import java.util.Date;

import com.example.employeeLeaveManagement.Enum.LeaveStatus;
import com.example.employeeLeaveManagement.Enum.LeaveType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LeaveRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer	leaveId;
	// Long employeeId;
//	public Long getEmployeeId() {
//		return employeeId;
//	}
//	public void setEmployeeId(Long employeeId) {
//		this.employeeId = employeeId;
//	}

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private LeaveType leaveType; // SICK, CASUAL, VACATION
	private LocalDate startDate;
	private LocalDate endDate;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private LeaveStatus status; //PenDING, APPROVED, REJECTED
	private String reason;
	private LocalDate appliedDate=LocalDate.now(); //Date, Default Current Date)
	@ManyToOne
	@JoinColumn(name="employeeId")
	private Employee employee;
	public LocalDate getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}


	public LeaveRequest() {
		
	}
	public LeaveRequest(Integer leaveId, LeaveType leaveType, LocalDate startDate, LocalDate endDate, LeaveStatus status,
			String reason, LocalDate appliedDate) {
		super();
		this.leaveId = leaveId;
		//this.employeeId=employeeId;
		this.leaveType = leaveType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.reason = reason;
		this.appliedDate=appliedDate;
		
	}
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LeaveStatus getStatus() {
		return status;
	}
	public void setStatus(LeaveStatus status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Override
	public String toString() {
		return "LeaveRequest [leaveId=" + leaveId + ", leaveType=" + leaveType
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + ", reason=" + reason
				+ ", appliedDate=" + appliedDate + "]";
	}
}
