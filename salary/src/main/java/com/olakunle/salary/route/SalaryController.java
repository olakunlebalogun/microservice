package com.olakunle.salary.route;

import com.olakunle.salary.domains.Salary;
import com.olakunle.salary.dto.SalaryResponse;
import com.olakunle.salary.services.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/view")
public class SalaryController {
    // Dependency Injection
    private final SalaryService salaryService;

    @GetMapping({"/list", "list/all"})
    public List<SalaryResponse> getSalaryList() {
        return salaryService.salaryList();
    }

    @PostMapping("/add")
    public Salary addSalary (@RequestBody Salary salary) {
        return salaryService.addSalary(salary);
    }
    @GetMapping({"/hello"})
    public String greetings() {
        return "Howdy guys, there is joy in the morning";
    }

}
