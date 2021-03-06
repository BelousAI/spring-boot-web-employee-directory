package com.belous.springboot.thymeleafwebappdemo.service;

import com.belous.springboot.thymeleafwebappdemo.entity.employee.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    void save(Employee theEmployee);

    Employee findById(int theId);

    void deleteById(int theId);
}
