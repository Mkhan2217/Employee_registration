package com.skyhigh.employeeregistration.DTO;

import java.io.Serializable;


@SuppressWarnings("serial")
public class RegistorDto implements Serializable {
	private Long empId;
	private String empName;
	private String email;
	private String contactNumber;
	private Integer age;
	private String address;
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
