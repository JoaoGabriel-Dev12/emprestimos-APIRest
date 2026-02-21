package com.joaogabriel.desafio.emprestimo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;

@Data
public class Person {
    
    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private String location;

    @Getter
    private List<Loan> loans = new ArrayList<>();

    public Person(Integer age, String cpf, String name, Double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }
}
