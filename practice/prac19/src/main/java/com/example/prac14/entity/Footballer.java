package com.example.prac14.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "footballers")
public class Footballer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String footballer_name;

    private String footballer_last;

    public Footballer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFootballer_name() {
        return footballer_name;
    }

    public void setFootballer_name(String footballer_name) {
        this.footballer_name = footballer_name;
    }

    public String getFootballer_last() {
        return footballer_last;
    }

    public void setFootballer_last(String footballer_last) {
        this.footballer_last = footballer_last;
    }
}
