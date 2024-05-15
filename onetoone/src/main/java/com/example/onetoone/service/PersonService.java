package com.example.onetoone.service;

import com.example.onetoone.entity.Person;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    List<Person> getAllPersons();
    Person getPersonById(Long id);
    Person updatePerson(Person person);
    void deletePerson(Long id);
}
