package com.pruevas.AccountMs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.pruevas.AccountMs.models.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

}
