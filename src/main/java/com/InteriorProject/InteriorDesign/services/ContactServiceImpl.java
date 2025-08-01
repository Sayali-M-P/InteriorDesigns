package com.InteriorProject.InteriorDesign.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.InteriorProject.InteriorDesign.model.Contact;
import com.InteriorProject.InteriorDesign.model.Designs;
import com.InteriorProject.InteriorDesign.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	@Qualifier("conRepo")
	private ContactRepository conRepo;
	
	
	@Override
	public Contact insertrecord(Contact c) {
		// TODO Auto-generated method stub
		return conRepo.save(c);
	}

	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return conRepo.findAll();
	}

	@Override
	public void del(int ci) {
		conRepo.deleteById(ci);
		
	}

	@Override
	public Contact updaterecord(int i, Contact c) {
		Optional<Contact> opt=conRepo.findById(i);
		if(opt.isPresent())
		{
			Contact rold=opt.get();
			rold.setName(c.getName());
			rold.setCity(c.getCity());
			rold.setMobile(c.getMobile());
			rold.setMessage(c.getMessage());
			return conRepo.save(rold);
			
		}
		return null;
	}

	@Override
	public Contact search(int i) {
		Optional<Contact> opt=conRepo.findById(i);
		if(opt.isPresent())
		{
			Contact rold=opt.get();
			return rold;
		}
		return null;
	}

	
	
}
