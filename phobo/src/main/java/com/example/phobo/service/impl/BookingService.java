package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phobo.domain.Booking;
import com.example.phobo.domain.BookingState;
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(Integer key) {
        // TODO Auto-generated method stub
    }

    public List<Booking> getBookingByCustomerId(int id) {
        return bookingRepository.findByCustomerId(id);
    }

    public List<Booking> getBookingByPhotographerId(int id) {
        return bookingRepository.findByPhotographerId(id);
    }

    @Override
    public Booking cancelBooking(int id) {
        Optional<Booking> bookingOptional = bookingRepository.findById(id);
            Booking bookingTemp = bookingOptional.get();
            bookingTemp.setState(BookingState.CANCELED);
            return bookingRepository.save(bookingTemp);
    }

    @Override
    public Booking acceptbBooking(int id) {
        Optional<Booking> bookingOptional = bookingRepository.findById(id);
        Booking bookingTemp = bookingOptional.get();
        bookingTemp.setState(BookingState.ACCEPTED);
        return bookingRepository.save(bookingTemp);
    }

    @Override
    public Booking declineBooking(int id) {
        Optional<Booking> bookingOptional = bookingRepository.findById(id);
            Booking bookingTemp = bookingOptional.get();
            bookingTemp.setState(BookingState.DECLINED);
            return bookingRepository.save(bookingTemp);
    }

    
}
