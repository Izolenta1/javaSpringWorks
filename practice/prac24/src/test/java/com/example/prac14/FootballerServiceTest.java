package com.example.prac14;

import com.example.prac14.entity.Footballer;
import com.example.prac14.repository.FootballerRepos;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FootballerServiceTest {
    @Mock
    private FootballerRepos footballerRepos;

    @Test
    public void getFootballerById() {
        Footballer footballer = new Footballer();

        footballer.setFootballer_name("test");
        footballer.setFootballer_last("test");
        footballer.setId(1);

        footballerRepos.getFootballerById(5);
    }
}
