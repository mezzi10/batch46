package com.messi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="cust_id")
	private int cust_id;
	private String name;
	private String father_name;
	private int age;
	private char sex;
	private Date date;
	private String qualification;
	private String branch_state;
	private String branch_id;//link to branch id with branch table
	private String branch_address;
	private String address;
	private String occupation;
	private String email;		
	private String password;
	
	public Customer() {}
	
	

	public Customer(String name, String father_name, int age, char sex,String qualification,
			 String address, String occupation,
			String email, String password) {
		super();
		this.name = name;
		this.father_name = father_name;
		this.age = age;
		this.sex = sex;		
		this.qualification = qualification;		
		this.address = address;
		this.occupation = occupation;
		this.email = email;
		this.password = password;
	}



	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
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

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
