package com.skyhigh.employeeregistration.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name="employee_info")
public class Registor implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="emp_id")
	private Long empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="email")
	private String email;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="age")
	private Integer age;
	@Column(name="address")
	private String address;
	@Column(name="pin_code")
	private Integer pinCode;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Registor [empId=" + empId + ", empName=" + empName + ", email=" + email + ", contactNumber="
				+ contactNumber + ", age=" + age + ", address=" + address + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
	
	
	

}
