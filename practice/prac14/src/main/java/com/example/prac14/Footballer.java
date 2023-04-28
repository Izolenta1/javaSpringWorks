package com.example.prac14;



public class Footballer {
    private String firstName;
    private String lastName;

    public Footballer(String name, String last) {
        this.firstName = name;
        this.lastName = last;
    }

    public String getFootballer() {
        return "Footballer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
