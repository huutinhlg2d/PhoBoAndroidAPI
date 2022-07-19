package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.Booking;

@Repository
public interface IBookingRepository extends JpaRepository<Booking, Integer> {
    
}
