package com.example.phobo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface IService<T, K> {
    List<T> getAll();

    Optional<T> getById(K key);

    T save(T entity);

    void deleteById(K key);
}
