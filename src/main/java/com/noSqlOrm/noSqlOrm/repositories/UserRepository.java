package com.noSqlOrm.noSqlOrm.repositories;

import com.noSqlOrm.noSqlOrm.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
