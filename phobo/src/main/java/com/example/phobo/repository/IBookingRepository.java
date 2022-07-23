package com.example.phobo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.Booking;

@Repository
public interface IBookingRepository extends JpaRepository<Booking, Integer> {
   
    @Query("SELECT e FROM Booking e WHERE e.customer.id = ?1")
    List<Booking> findByCustomerId(int id);

    @Query("SELECT e FROM Booking e WHERE e.photographer.id = ?1")
    List<Booking> findByPhotographerId(int id);
}
