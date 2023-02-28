package com.example.springbootmongodb.repositories;

import com.example.springbootmongodb.model.Release;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends MongoRepository<Release, String>{
}

