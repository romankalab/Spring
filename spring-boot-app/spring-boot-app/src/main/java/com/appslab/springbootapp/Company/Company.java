package com.appslab.springbootapp.Company;

import com.appslab.springbootapp.Address.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName(){
        return name;
    }

    public void setName(String name){ this.name = name; }
}
