package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT t FROM Person t where t.surname = :surname")
    public List<Person> findAllBySurname(String surname);

    @Query("SELECT t FROM Person t where t.name = :name")
    public List<Person> findAllByName(String name);
}
