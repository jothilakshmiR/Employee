package com.program.Employees;

import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class WorkName {

	
	
	
	private String Fname;
	private String Lname;
	private String Mname;
	private Long salary;
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
	private Date joinedOn;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		this.Fname = fname;
	}
	@Override
	public String toString() {
		return "WorkName [fname=" + Fname + ", lname=" + Lname + ", mname=" + Mname + "]";
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		this.Lname = lname;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		this.Mname = mname;
	}
}
