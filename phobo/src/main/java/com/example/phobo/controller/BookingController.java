package com.example.phobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phobo.domain.Booking;
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

    // @GetMapping("/customer")
    // public ResponseEntity<List<Booking>> getBookingByUserId(String email) {
    //     List<Booking> bookingByUser=bookingService.get

    // }

}
