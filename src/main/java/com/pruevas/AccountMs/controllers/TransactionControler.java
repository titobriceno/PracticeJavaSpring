package com.pruevas.AccountMs.controllers;
import com.pruevas.AccountMs.repositories.AccountRepository;
import com.pruevas.AccountMs.repositories.TransactionRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionControler {
    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionControler(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }
}