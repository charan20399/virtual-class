package com.capg.labook;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Value("${eId}")
	private int empId;
	@Value("${eName}")
	private String empName;
	@Value("${eSal}")
	private double empSal;
	//@Value("${eBUnit}")
	private SBU empBU;
	@Value("${eAge}")
	private int empAge;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, double empSal, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		//this.empBU = empBU;
		this.empAge = empAge;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAge=" + empAge + "]";
	}

	public SBU getSbuDetails() {
		return empBU;
		
		
	}

}
