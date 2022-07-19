package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.phobo.domain.Booking;
import com.example.phobo.service.IBookingService;

@Service
public class BookingService implements IBookingService{
    

    @Override
    public List<Booking> getAll() {        
        return null;
    }

    @Override
    public Optional<Booking> getById(Integer key) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Booking save(Booking entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(Integer key) {
        // TODO Auto-generated method stub
    }
    
}
