package com.example.phobo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.phobo.domain.Customer;
import com.example.phobo.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService{

    @Override
    public List<Customer> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Customer> getById(Integer key) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Customer save(Customer entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(Integer key) {
        // TODO Auto-generated method stub
        
    }

}