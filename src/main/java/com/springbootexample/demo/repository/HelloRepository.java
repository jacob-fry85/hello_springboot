package com.springbootexample.demo.repository;

import com.springbootexample.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Employee, Integer> {
}