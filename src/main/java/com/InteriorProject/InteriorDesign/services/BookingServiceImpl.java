package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.InteriorProject.InteriorDesign.model.Booking;
import com.InteriorProject.InteriorDesign.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	@Qualifier("bookRepo")
	private BookingRepository bookRepo;
	
	@Override
	public Booking insert(Booking b) {
		// TODO Auto-generated method stub
		return bookRepo.save(b);
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void cancelbooking(int bid) {
		bookRepo.deleteById(bid);
		
	}

}
