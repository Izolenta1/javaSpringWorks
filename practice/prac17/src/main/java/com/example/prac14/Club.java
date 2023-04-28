package com.example.prac14;

import jakarta.persistence.*;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String clubName;

    private int footballerID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getFootballerID() {
        return footballerID;
    }

    public void setFootballerID(int footballerID) {
        this.footballerID = footballerID;
    }
}
