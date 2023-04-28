package com.example.prac14.service;

import com.example.prac14.entity.Footballer;
import com.example.prac14.repository.FootballerRepos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class FootballerService {
    @Autowired
    private FootballerRepos footballerRepos;

    @Transactional
    public Footballer getFootballerById(int id) {
        log.info("Get footballer by ID {}", id);
        return footballerRepos.getFootballerById(id);
    }
}
