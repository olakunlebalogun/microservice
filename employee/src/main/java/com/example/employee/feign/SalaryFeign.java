package com.example.employee.feign;

import com.example.employee.dto.SalaryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "Department", url = "localhost:9001/departments")
public interface SalaryFeign {
    @GetMapping(value="/list", produces="application/json")
    List<SalaryResponse> salaryList();
}
