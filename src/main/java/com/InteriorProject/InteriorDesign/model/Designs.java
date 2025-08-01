package com.InteriorProject.InteriorDesign.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Designs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int designid;
	private String designname,price,imagepath;
	public Designs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Designs(String designname, String price, String imagepath) {
		super();
		this.designname = designname;
		this.price = price;
		this.imagepath = imagepath;
	}

	public int getDesignid() {
		return designid;
	}
	public void setDesignid(int designid) {
		this.designid = designid;
	}
	public String getDesignname() {
		return designname;
	}
	public void setDesignname(String designname) {
		this.designname = designname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	
	

}
