package com.example.prac14;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "footballers")
public class Footballer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String footballerName;

    private String footballerLast;

//    @OneToMany (mappedBy = "footballer")
//    private List<Club> clubs;

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

//    public List<Club> getClubs() {
//        return clubs;
//    }
//
//    public void setClubs(List<Club> clubs) {
//        this.clubs = clubs;
//    }
}
