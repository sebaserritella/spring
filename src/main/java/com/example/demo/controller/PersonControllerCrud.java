package com.example.demo.controller;

import com.example.demo.crud.PersonCrud;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public abstract class PersonControllerCrud {

    @Autowired
    private PersonCrud personCrud;

    @GetMapping("/persons")
    public Iterable<Person> getPersons() {
        return personCrud.findAll();
    }

    @PostMapping("/persons")
    public Person newPerson(@RequestBody Person p) {
        return personCrud.save(p);
    }

}
