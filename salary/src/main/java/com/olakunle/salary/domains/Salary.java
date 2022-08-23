package com.olakunle.salary.domains;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "salary")
public class Salary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, name = "staff_code", nullable = false)
    private String staffCode;

    @Column(name = "payment_date")
    private String paymentDate;
    @Column(name = "staff_name", nullable = false)
    private String staffName;
    @Column(name = "amount", precision = 10)
    private BigInteger amount;
}
