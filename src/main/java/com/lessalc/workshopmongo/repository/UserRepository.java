package com.lessalc.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lessalc.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
