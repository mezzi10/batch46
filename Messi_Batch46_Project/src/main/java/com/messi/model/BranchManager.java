package com.messi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class BranchManager {
	
	@Id
	@GeneratedValue
	@Column(name="manager_id")
	private int manager_id;
	private String name;
	private String father_name;
	private int age;
	private char sex;
	private String qualification;
	private String branch_state;
	private String branch_cities;
	private String branch_address;
	private String address;
	private String phone;
	private String location;
	private Date date;
	private String city;
	private String state;
	private String password;
	
	public BranchManager() {}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getBranch_state() {
		return branch_state;
	}

	public void setBranch_state(String branch_state) {
		this.branch_state = branch_state;
	}

	public String getBranch_cities() {
		return branch_cities;
	}

	public void setBranch_cities(String branch_cities) {
		this.branch_cities = branch_cities;
	}

	public String getBranch_address() {
		return branch_address;
	}

	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	

}
