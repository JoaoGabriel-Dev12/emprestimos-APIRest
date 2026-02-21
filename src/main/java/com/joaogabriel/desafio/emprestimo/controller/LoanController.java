package com.joaogabriel.desafio.emprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaogabriel.desafio.emprestimo.model.Person;
import com.joaogabriel.desafio.emprestimo.service.LoanService;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity add(@RequestBody Person person) {

        loanService.listLoans(person, person.getLoans());
        return ResponseEntity.ok().body(person);
    }
}
