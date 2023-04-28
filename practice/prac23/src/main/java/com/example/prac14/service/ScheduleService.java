package com.example.prac14.service;

import com.example.prac14.repository.FootballerRepos;
import com.example.prac14.entity.Footballer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ScheduleService {
    @Autowired
    private FootballerRepos footballerRepos;

    private boolean enable = true;

    @ManagedOperation
    @Scheduled(cron = "0 * * * * *")
    public void doTask() {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        Path pathToBuffer = Path.of(s + "\\src\\main\\java\\com\\example\\prac14\\task22Buffer");
        if (enable) {
            try {
                Files.deleteIfExists(Path.of(pathToBuffer.toString() + "\\Footballer.json"));
                Footballer footballer = footballerRepos.getFootballerById(5);
                ObjectMapper mapper = new ObjectMapper();
                mapper.writeValue(new File(pathToBuffer.toString() + "\\Footballer.json"), footballer);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
