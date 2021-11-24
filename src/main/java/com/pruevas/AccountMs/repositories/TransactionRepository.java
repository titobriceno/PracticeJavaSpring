package com.pruevas.AccountMs.repositories;
import com.pruevas.AccountMs.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String > {
    List<Transaction> getByUsernameOrigin(String userNameOrigin);
    List<Transaction> getByUsernameDestiny(String userNameDestiny);


}
