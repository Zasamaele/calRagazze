package com.example.corso1.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "character_data")
public class Character {
    @Id
    @Column(name="id")
    private int Id;
    private String name;
    private  double statistic;

    public Character(){

    }

    public int getId (){ return  Id;}
    public  String getName(){return name;}
    public void setName(String name) {
        this.name = name;
    }
    public double getStatistic(){return statistic;}
    public void setStatistic(double statistic) {this.statistic = statistic;}

}
