package com.example.phobo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phobo.domain.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}