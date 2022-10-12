package com.admin.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRequests {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reqId;
	private String reqName;
	private String reqState;
	private String email;
	private String pass;
	private String name;
	private Date dob;
	private String address;
	private long mobileNo;
	private String gender;
	public long getReqId() {
		return reqId;
	}
	public void setReqId(long reqId) {
		this.reqId = reqId;
	}
	public String getReqName() {
		return reqName;
	}
	public void setReqName(String reqName) {
		this.reqName = reqName;
	}
	public String getReqState() {
		return reqState;
	}
	public void setReqState(String reqState) {
		this.reqState = reqState;
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
	public UserRequests(long reqId, String reqName, String reqState, String email, String pass, String name, Date dob,
			String address, long mobileNo, String gender) {
		super();
		this.reqId = reqId;
		this.reqName = reqName;
		this.reqState = reqState;
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.mobileNo = mobileNo;
		this.gender = gender;
	}
	public UserRequests() {
		super();
	}
	@Override
	public String toString() {
		return "UserRequests [reqId=" + reqId + ", reqName=" + reqName + ", reqState=" + reqState + ", email=" + email
				+ ", pass=" + pass + ", name=" + name + ", dob=" + dob + ", address=" + address + ", mobileNo="
				+ mobileNo + ", gender=" + gender + "]";
	}
	
	
	
}
