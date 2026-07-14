package com.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Model {
    @Id  //it becomes primary key
    private int id;
    private String name;
    private String email;

//    Constructor
    public Model() {
    }

    public Model(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

//    getters  and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
