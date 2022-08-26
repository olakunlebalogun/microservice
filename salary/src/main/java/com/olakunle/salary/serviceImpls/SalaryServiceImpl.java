package com.olakunle.salary.serviceImpls;

import com.olakunle.salary.domains.Salary;
import com.olakunle.salary.dto.SalaryResponse;
import com.olakunle.salary.repositories.SalaryRepository;
import com.olakunle.salary.services.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SalaryServiceImpl implements SalaryService {
    // Dependency Injection
    private final SalaryRepository salaryRepository;

    // To fetch the list of the salary.
    @Override
    public List<SalaryResponse> salaryList() {

        List<SalaryResponse> salaryResponses = new ArrayList<>();
        List<Salary> salaryList = salaryRepository.findAll();

        // Checking if the list is empty, then throw an exception
        if(salaryList.isEmpty()) {
            throw new RuntimeException("The List empty, please check your code if necessary");
        }
        else  {
            for (Salary i : salaryList) {
                SalaryResponse salaryResponse = new SalaryResponse();
                salaryResponse.setAmount(i.getAmount());
                salaryResponse.setStaffName(i.getStaffName());
                salaryResponse.setPaymentDate(i.getPaymentDate());

                salaryResponses.add(salaryResponse);
            }
            return salaryResponses;
        }

    }

    @Override
    public Salary addSalary(Salary salary) {
        return salaryRepository.save(salary);
    }
}
