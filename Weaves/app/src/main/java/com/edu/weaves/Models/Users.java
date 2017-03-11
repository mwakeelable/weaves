package com.edu.weaves.Models;

public class Users {
    private int ID;
    private String name;
    private double age;
    private double score;

    public Users(){

    }

    public Users(String name, double age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Users(int ID, String name, double age, double score) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
