package com.example.prac14.repository;

import com.example.prac14.entity.Footballer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballerRepos extends CrudRepository<Footballer, Integer> {
    Footballer getFootballerById(int id);
}
