package com.messi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ceo")
public class CEO {
	
	private String name;
	private String father_name;
	private int age;
	private char sex;	
	private String branches_states;
	private String branches_cities;
	private String branches_address;
	private String address;
	private String phone;
	private String location;
	private Date date;
	private String city;
	private String state;
	private String password;
	
	public CEO() {}

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

	public String getBranches_states() {
		return branches_states;
	}

	public void setBranches_states(String branches_states) {
		this.branches_states = branches_states;
	}

	public String getBranches_cities() {
		return branches_cities;
	}

	public void setBranches_cities(String branches_cities) {
		this.branches_cities = branches_cities;
	}

	public String getBranches_address() {
		return branches_address;
	}

	public void setBranches_address(String branches_address) {
		this.branches_address = branches_address;
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
