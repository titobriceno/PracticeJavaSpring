package com.pruevas.AccountMs.controllers;
import com.pruevas.AccountMs.models.Account;
import com.pruevas.AccountMs.repositories.AccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class AccountController {
    private final AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/accounts/{username}")
    public Optional<Account> getAccount(@PathVariable String username){
        return this.repository.findById(username);
    }

    @PostMapping("/accounts")
    public Account newAccount(@RequestBody Account account){
        return this.repository.save(account);
    }

    @DeleteMapping("/accounts/{username}")
    public void deleteAccount(@PathVariable String username){
        repository.deleteById(username);
    }

    @PutMapping("/account/{username}")
    public Account updateAccount(@PathVariable String username, @RequestBody Account new_account){
        Account old_account = repository.findById(username).orElse(null);
//        esto actualiza el objeto en java
        old_account.setBalance(new_account.getBalance());
        old_account.setLastChange(new_account.getLastChange());
// esto actiliza la base de datos
        return repository.save(old_account);
    }

}
