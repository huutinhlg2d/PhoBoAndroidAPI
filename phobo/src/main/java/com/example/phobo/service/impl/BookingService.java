package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phobo.domain.Booking;
import com.example.phobo.repository.IBookingRepository;
import com.example.phobo.service.IBookingService;

@Service
public class BookingService implements IBookingService{
    
    @Autowired
    IBookingRepository bookingRepository;

    @Override
    public List<Booking> getAll() {        
        return bookingRepository.findAll();
    }

    @Override
    public Optional<Booking> getById(Integer key) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Booking save(Booking entity) {
        return bookingRepository.save(entity);
    }

    @Override
    public void deleteById(Integer key) {
        // TODO Auto-generated method stub
    }

    // public List<Booking> getBookingByUserId(int id) {

    
    
}
