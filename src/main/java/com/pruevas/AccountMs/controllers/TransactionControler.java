package com.pruevas.AccountMs.controllers;
import com.pruevas.AccountMs.models.Transaction;
import com.pruevas.AccountMs.repositories.AccountRepository;
import com.pruevas.AccountMs.repositories.TransactionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionControler {
    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionControler(TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @GetMapping("transactions/{UserNameOrigin}")
    List<Transaction> getTransactionByUserNameOrigin(@PathVariable String userNameOrigin){
        return transactionRepository.getByUsernameOrigin(userNameOrigin);
    }

    @PostMapping("/transaction/")
    Transaction newTransaction(@RequestBody Transaction transaction){
        return transactionRepository.save(transaction);
    }
}