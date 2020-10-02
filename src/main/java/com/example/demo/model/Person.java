package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Person {

    @Id
    private Long dni;
    @Column
    private String name;
    @Column
    private String surname;
    @ManyToOne
    private Address address;


    public Person() {
    }

    public Person(Long dni, String name, String surname, Address address) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }
}
