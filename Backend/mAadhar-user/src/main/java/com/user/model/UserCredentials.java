package com.user.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserCredentials {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uId;
	private String email;
	private String pass;
	private String name;
	private Date dob;
	private String address;
	private long mobileNo;
	private String gender;
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public UserCredentials(long uId, String email, String pass, String name, Date dob, String address, long mobileNo,
			String gender) {
		super();
		this.uId = uId;
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.mobileNo = mobileNo;
		this.gender = gender;
	}
	public UserCredentials() {
		super();
	}
	@Override
	public String toString() {
		return "UserCredentials [uId=" + uId + ", email=" + email + ", pass=" + pass + ", name=" + name + ", dob=" + dob
				+ ", address=" + address + ", mobileNo=" + mobileNo + ", gender=" + gender + "]";
	}
	
	
	
	

}
