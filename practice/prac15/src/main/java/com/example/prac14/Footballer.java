package com.example.prac14;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "footballers")
public class Footballer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String footballerName;

    private String footballerLast;

    public Footballer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFootballerName() {
        return footballerName;
    }

    public void setFootballerName(String footballerName) {
        this.footballerName = footballerName;
    }

    public String getFootballerLast() {
        return footballerLast;
    }

    public void setFootballerLast(String footballerLast) {
        this.footballerLast = footballerLast;
    }
}
