package com.springjpa.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springjpa.demo.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer>{

}
