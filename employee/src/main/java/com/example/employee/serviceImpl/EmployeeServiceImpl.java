package com.example.employee.serviceImpl;

import com.example.employee.EmployeeRepo;
import com.example.employee.dto.Department;
import com.example.employee.dto.EmployeeDept;
import com.example.employee.feign.DepartmentFeign;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final RestTemplate restTemplate;

    private final DepartmentFeign departmentFeign;
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

    @Override
    public EmployeeDept getEmployeeAndDept(Long employeeId) {

        if (employeeId == null) {
            log.info("No Department with this code!!!");
        }

        EmployeeDept employeeDept = new EmployeeDept();
        Employee employee = employeeRepo.findEmployeeById(employeeId);
//        Department department = restTemplate.getForObject("http://localhost:9001/department" + employee.getDepartmentId(), Department.class);
        Department department = departmentFeign.findDepartmentById(employee.getDepartmentId());
        employeeDept.setEmployee(employee);
        employeeDept.setDepartment(department);

        return employeeDept;

    }

}
