package com.example.phobo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.Booking;
import com.example.phobo.domain.BookingState;
import com.example.phobo.domain.Customer;
import com.example.phobo.domain.Photographer;
import com.example.phobo.service.IBookingService;
import com.example.phobo.service.impl.BookingService;

import net.bytebuddy.agent.VirtualMachine.ForHotSpot.Connection.Response;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<Booking>> getAll() {
        List<Booking> list= bookingService.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<List<Booking>> getBookingByCustomerId(@PathVariable int id) {;
        List<Booking> bookingByCustomer=bookingService.getBookingByCustomerId(id);
        return ResponseEntity.ok(bookingByCustomer);
    }

    @GetMapping("/photographer/{id}")
    public ResponseEntity<List<Booking>> getBookingByPhotographerId(@PathVariable int id) {
        List<Booking> bookingByPhotographer=bookingService.getBookingByPhotographerId(id);
        return ResponseEntity.ok(bookingByPhotographer);
    }

    // @GetMapping("/customer/{id}")
    // public ResponseEntity<List<Booking>> getBookingByUserId(@PathVariable ("id") @RequestBody Customer customer) {
    //     int id = customer.getId();
    //     List<Booking> bookingByUser=bookingService.getBookingByUserId(id);
    //     return ResponseEntity.ok(bookingByUser);
    // }

    @PutMapping("/cancel/{id}")
    public ResponseEntity<Booking> cancelBookingRequest(@PathVariable int id) {
        System.out.println(id);
        Booking booking = bookingService.cancelBooking(id);
        return ResponseEntity.ok(booking);
    }

    @PutMapping("/accept/{id}")
    public ResponseEntity<Booking> acceptBookingRequest(@PathVariable int id) {
        Booking booking = bookingService.acceptbBooking(id);
        return ResponseEntity.ok(booking);
    }

    @PutMapping("/decline/{id}")
    public ResponseEntity<Booking> declineBookingRequest(@PathVariable int id) {
        Booking booking = bookingService.declineBooking(id);
        return ResponseEntity.ok(booking);
    }


}
