package com.example.demo.service;
import com.example.demo.entity.*;
import java.util.List;

public interface EmployeeService {
public List<Employee> findAll();
public void save(Employee theEmployee);
}
