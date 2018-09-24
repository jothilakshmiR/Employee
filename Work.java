package com.program.Employees;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.program.Employees.WorkName;



@Entity
@Table(name="Work_table")
public class Work {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="EMP_ID")
	private int WId;
	
	private WorkName WName;
	
	private String department;
	@Column(name="Work_department")
	private Long salary;
	 @Column(name="JOINED_ON")
	private Date joinedOn;
	public int getId() {
		return WId;
	}
	public void setId(int id) {
		WId = id;
	}
	public WorkName getWName() {
		return WName;
	}
	public void setWName(WorkName wName) {
		WName = wName;
	}
	public WorkName getName() {
		return WName;
	}
	public void setName(String name) {
		this.WName = WName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Date getJoinedOn() {
		return joinedOn;
	}
	public void setJoinedOn(Date joinedOn) {
		this.joinedOn = joinedOn;
	}
	@Override
	public String toString() {
		return "Work [WId=" + WId + ", WName=" + WName + ", department=" + department + ", salary=" + salary
				+ ", joinedOn=" + joinedOn + "]";
	}
	

}
