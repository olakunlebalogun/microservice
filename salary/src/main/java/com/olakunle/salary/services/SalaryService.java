package com.olakunle.salary.services;

import com.olakunle.salary.dto.SalaryResponse;

import java.util.List;

public interface SalaryService {
    List<SalaryResponse> salaryList();
}
