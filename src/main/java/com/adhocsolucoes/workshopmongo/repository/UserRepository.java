package com.adhocsolucoes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adhocsolucoes.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String>{

}
