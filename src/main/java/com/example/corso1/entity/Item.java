package com.example.corso1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "item")

public class Item {
    @Id
    @Column (name = "id")

    private int id;
    private String name;
    public void id (){

    }

    public int getId() { return id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
