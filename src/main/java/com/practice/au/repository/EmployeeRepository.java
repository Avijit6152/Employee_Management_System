package com.practice.au.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.au.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
