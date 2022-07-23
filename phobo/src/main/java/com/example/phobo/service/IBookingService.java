package com.example.phobo.service;

import org.springframework.stereotype.Service;

import com.example.phobo.domain.Booking;
import com.example.phobo.domain.BookingState;

@Service
public interface IBookingService extends IService<Booking, Integer> {
    
    public Booking cancelBooking(int id);
    public Booking acceptbBooking(int id);
    public Booking declineBooking(int id);


}
