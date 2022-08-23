package com.example.employee.route;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeRoute {
    private final EmployeeService employeeService;
    @PostMapping("/add")
    public Employee addEmployee(Employee payload){
        return employeeService.addEmployee(payload);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Long id){
         employeeService.deleteEmployee(id);
    }
    @GetMapping("/fetch")
    public List<Employee> addEmployee(){
        return employeeService.listEmployee();
    }
}
