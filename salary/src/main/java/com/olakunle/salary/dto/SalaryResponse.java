package com.olakunle.salary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryResponse {

private String staffName;
private String paymentDate;
private BigInteger amount;
}
