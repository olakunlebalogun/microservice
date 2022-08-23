package com.example.employee.serviceImpl;

import com.example.employee.EmployeeRepo;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee payload) {
         return employeeRepo.save(payload);
    }

    @Override
    public void deleteEmployee(Long id) {
         employeeRepo.deleteById(id);
    }

    @Override
    public List<Employee> listEmployee() {
        return employeeRepo.findAll();
    }
}
