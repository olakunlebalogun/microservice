package com.example.employee.service;

import com.example.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
   public Employee addEmployee(Employee payload);
   public void deleteEmployee(Long id);
   public List<Employee> listEmployee();
}
