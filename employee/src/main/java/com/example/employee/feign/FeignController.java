package com.example.employee.feign;

import com.example.employee.dto.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class FeignController {

    private final DepartmentFeign departmentFeign;

    @PostMapping("/add-department")
    public Department addDepartment (@RequestBody Department department) {
        return departmentFeign.saveDepartment(department);
    }

}
