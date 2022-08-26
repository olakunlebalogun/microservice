package com.example.employee.feign;

import com.example.employee.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//@Component
@FeignClient(value = "department", url = "localhost:9001/departments")
public interface DepartmentFeign {
    @PostMapping(value = "/add", produces = "application/json")
    Department saveDepartment(Department payload);
}
