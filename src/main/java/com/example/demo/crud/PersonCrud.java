package com.example.demo.crud;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface PersonCrud extends CrudRepository<Person, Long> {

    List<Person> findBySurname(String surname);
}
