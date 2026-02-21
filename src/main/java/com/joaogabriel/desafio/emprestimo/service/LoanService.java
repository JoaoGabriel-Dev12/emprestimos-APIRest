package com.joaogabriel.desafio.emprestimo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joaogabriel.desafio.emprestimo.model.Loan;
import com.joaogabriel.desafio.emprestimo.model.Person;
import com.joaogabriel.desafio.emprestimo.model.enums.TypeLoan;

@Service
public class LoanService {

    public void listLoans(Person person, List<Loan> loans) {

        if(person.getIncome() <= 3000.0) {
            loans.add(new Loan(TypeLoan.PERSONAL, TypeLoan.PERSONAL.getInterest_rate()));
            loans.add(new Loan(TypeLoan.GUARANTEED, TypeLoan.GUARANTEED.getInterest_rate()));
        }
        if(person.getIncome() > 3000.0 && person.getIncome() < 5000.0 && 
        person.getAge() < 30 && person.getLocation().equals("SP")) {
            loans.add(new Loan(TypeLoan.PERSONAL, TypeLoan.PERSONAL.getInterest_rate()));
            loans.add(new Loan(TypeLoan.GUARANTEED, TypeLoan.GUARANTEED.getInterest_rate()));
        }
        if(person.getIncome() >= 5000.0) {
            loans.add(new Loan(TypeLoan.CONSIGNMENT, TypeLoan.CONSIGNMENT.getInterest_rate()));
        }
    }
}
