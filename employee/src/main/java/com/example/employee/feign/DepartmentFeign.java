package com.example.employee.feign;

import com.example.employee.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//@Component
@FeignClient(value = "department", url = "localhost:9001/departments")
public interface DepartmentFeign {
    @PostMapping(value = "/add", produces = "application/json")
    Department saveDepartment(Department payload);

    @GetMapping(value="/{id}", produces="application/json")
    Department findDepartmentById(@PathVariable("id") Long departmentId);

    @GetMapping(value="/", produces="application/json")
    List<Department> fetchDepartment();

}
