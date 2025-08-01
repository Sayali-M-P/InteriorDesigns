package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import com.InteriorProject.InteriorDesign.model.Contact;

public interface ContactService {
	
	Contact insertrecord(Contact c);
	List<Contact> getAll();
	void del(int ci);
	Contact updaterecord(int i,Contact c);
	Contact search(int i);

}
