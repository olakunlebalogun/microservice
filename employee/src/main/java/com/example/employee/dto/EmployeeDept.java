package com.example.employee.dto;

import com.example.employee.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDept {
    private Department department;
    private Employee employee;
}
