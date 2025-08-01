package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import com.InteriorProject.InteriorDesign.model.Booking;

public interface BookingService {
Booking insert(Booking b);
List<Booking> getAllBooking();
void cancelbooking(int bid);

}
