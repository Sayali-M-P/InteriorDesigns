package com.InteriorProject.InteriorDesign.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int regid;
	private String name,address,city,contact,emailid,password;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String name, String address, String city, String contact, String emailid, String password) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.contact = contact;
		this.emailid = emailid;
		this.password = password;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	};
	
	
	
	

}
