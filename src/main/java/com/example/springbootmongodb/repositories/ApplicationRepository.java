package com.example.springbootmongodb.repositories;

import com.example.springbootmongodb.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends MongoRepository<Application, String>{
}

