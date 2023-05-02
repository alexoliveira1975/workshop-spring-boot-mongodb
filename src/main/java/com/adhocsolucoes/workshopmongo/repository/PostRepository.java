package com.adhocsolucoes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adhocsolucoes.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
