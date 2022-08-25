package com.example.employee;

import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Employee findEmployeeById(Long employeeId);
}
