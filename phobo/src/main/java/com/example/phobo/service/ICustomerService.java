package com.example.phobo.service;

import org.springframework.stereotype.Service;

import com.example.phobo.domain.Customer;

@Service
public interface ICustomerService extends IService<Customer, Integer> {

}