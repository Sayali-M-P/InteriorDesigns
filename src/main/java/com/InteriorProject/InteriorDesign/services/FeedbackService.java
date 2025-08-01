package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import com.InteriorProject.InteriorDesign.model.Feedback;


public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);

}
