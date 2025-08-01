package com.InteriorProject.InteriorDesign.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feedid;
	private String name,message;
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	public int getFeedid() {
		return feedid;
	}
	public void setFeedid(int feedid) {
		this.feedid = feedid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
