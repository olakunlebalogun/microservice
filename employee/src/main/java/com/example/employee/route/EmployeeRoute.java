package com.example.employee.route;

import com.example.employee.dto.Department;
import com.example.employee.feign.DepartmentFeign;
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


    private final DepartmentFeign departmentFeign;

    @PostMapping("/add-department")
    public Department addDepartment (@RequestBody Department department) {
        return departmentFeign.saveDepartment(department);
    }

    @GetMapping("/list")
    public List<Department> listDepartment() {
        return departmentFeign.fetchDepartment();
    }
    @GetMapping("/list/{departmentId}")
    public Department getDepartment(@PathVariable("departmentId") Long departmentId){
        return departmentFeign.findDepartmentById(departmentId);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee payload){
        return employeeService.addEmployee(payload);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Long id){
         employeeService.deleteEmployee(id);
    }
    @GetMapping("/fetch")
    public List<Employee> fetchEmployee(){
        return employeeService.listEmployee();
    }

}
