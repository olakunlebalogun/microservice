package com.example.employee.service;

import com.example.employee.dto.EmployeeDept;
import com.example.employee.model.Employee;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface EmployeeService {
   public Employee addEmployee(Employee payload);
   public void deleteEmployee(Long id);
   public List<Employee> listEmployee();
   EmployeeDept getEmployeeAndDept (Long employeeId);
}
