package com.example.onetoone.service.Impl;

import com.example.onetoone.entity.Person;
import com.example.onetoone.repository.PersonRepo;
import com.example.onetoone.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepo personRepo;

    @Override
    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepo.findById(id).orElse(null);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }
}
