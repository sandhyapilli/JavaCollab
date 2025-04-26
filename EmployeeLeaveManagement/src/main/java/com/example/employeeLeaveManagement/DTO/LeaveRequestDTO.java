package com.example.employeeLeaveManagement.DTO;

import java.time.LocalDate;

import com.example.employeeLeaveManagement.Enum.LeaveStatus;
import com.example.employeeLeaveManagement.Enum.LeaveType;

import jakarta.validation.constraints.NotNull;
//we should mention foreign key only in DTO because to pass values to apis
public class LeaveRequestDTO {
    private Integer leaveId; // Should not be set in POST request if auto-generated
    private Long employeeId;
    @NotNull(message = "Leave type should not be null")
    private LeaveType leaveType; // SICK, CASUAL, VACATION

    @NotNull(message = "Start date should not be null")
    private LocalDate startDate; // ✅ Changed to LocalDate for consistency

    @NotNull(message = "End date should not be null")
    private LocalDate endDate; // ✅ Changed to LocalDate for consistency

    private LeaveStatus status; // PENDING, APPROVED, REJECTED
    private String reason;

    private LocalDate appliedDate = LocalDate.now(); // Default to today

    public LeaveRequestDTO() {
        super();
    }

    public LeaveRequestDTO(Integer leaveId, Long employeeId,LeaveType leaveType, LocalDate startDate,
            LocalDate endDate, LeaveStatus status, String reason, LocalDate appliedDate) {
        this.leaveId = leaveId;
       this.employeeId=employeeId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.reason = reason;
        this.appliedDate = appliedDate;
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    @Override
	public String toString() {
		return "LeaveRequestDTO [leaveId=" + leaveId + ", employeeId=" + employeeId + ", leaveType=" + leaveType
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + ", reason=" + reason
				+ ", appliedDate=" + appliedDate + "]";
	}
}
