package com.example.employee.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "position")
    private String position;

    @Column(name = "district")
    private String district;

    @Column(name = "age")
    private Integer age;

}
