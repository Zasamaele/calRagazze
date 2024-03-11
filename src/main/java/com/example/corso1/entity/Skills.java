package com.example.corso1.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table ( name = "SKILLS")
public class Skills {
    @Id
    private Long id;
    private String skill;

    public void Skills(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;

    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
