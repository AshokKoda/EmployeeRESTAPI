package com.ashok;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int employeeId;

	@Column(name = "fname")
	private String firstName;

	@Column(name = "lname")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phoneno")
	private String phoneNo;

	@Column(name = "doj")
	private String doj;

	@Column(name = "salary")
	private double salary;

	@Column(name = "total_salary")
	private int totalSalary;

	@Column(name = "tax_pay")
	private int taxPay;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public int getTaxPay() {
		return taxPay;
	}

	public void setTaxPay(int taxPay) {
		this.taxPay = taxPay;
	}

}
