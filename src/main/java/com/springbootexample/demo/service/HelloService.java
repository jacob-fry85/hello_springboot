package com.springbootexample.demo.service;

import com.springbootexample.demo.repository.HelloRepository;
import com.springbootexample.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {
    @Autowired
    private HelloRepository helloRepository;
    public Optional<Employee> findById(int id) {
        return helloRepository.findById(id);
    }
}
