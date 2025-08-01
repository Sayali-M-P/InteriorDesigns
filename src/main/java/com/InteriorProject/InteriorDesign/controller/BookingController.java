package com.InteriorProject.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InteriorProject.InteriorDesign.model.Booking;
import com.InteriorProject.InteriorDesign.services.BookingService;

@RestController
@RequestMapping("/interiordesign/")
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {
	@Autowired
	private BookingService bs;
	
	@PostMapping("/booking")
	public Booking insert(@RequestBody Booking b)
	{
		return bs.insert(b);
	}
	
	@GetMapping("/booking")
	public List<Booking> getAll()
	{
		return bs.getAllBooking();
	}
	
	@DeleteMapping("/booking/{bid}")
	public void delete(@PathVariable("bid")int bi)
	{
		bs.cancelbooking(bi);
	}

}
