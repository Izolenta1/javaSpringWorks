package com.example.prac14;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

@Repository
public class FootballerRepos {
    private final JdbcTemplate jdbcTemplate;

    public FootballerRepos() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("zNvidq012V");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(Footballer footballer) {
        String sql = "INSERT INTO footballers (footballerName, footballerLast) VALUES (?, ?)";
        jdbcTemplate.update(
                sql,
                footballer.getFootballerName(),
                footballer.getFootballerLast()
        );
    }

    public void delete(int id) {
        String sql = "DELETE FROM footballers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public List<Footballer> get() {
        String sql = "SELECT * FROM footballers";
        return jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(Footballer.class)
        );
    }
}
