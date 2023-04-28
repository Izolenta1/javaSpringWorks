package com.example.prac14.service;

import com.example.prac14.entity.Footballer;
import com.example.prac14.repository.FootballerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballerService {
    @Autowired
    private FootballerRepos footballerRepos;

    public Footballer getFootballerById(int id) {
        return footballerRepos.getFootballerById(id);
    }
}
