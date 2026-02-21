package com.joaogabriel.desafio.emprestimo.model;

import com.joaogabriel.desafio.emprestimo.model.enums.TypeLoan;

import lombok.Data;

@Data
public class Loan {
    
    private TypeLoan type;
    private Integer interest_rate;

    public Loan(TypeLoan type, Integer interest_rate) {
        this.type = type;
        this.interest_rate = interest_rate;
    }
}
