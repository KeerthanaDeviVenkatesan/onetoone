package com.example.onetoone.controller;

import com.example.onetoone.entity.Person;
import com.example.onetoone.repository.PersonRepo;
import com.example.onetoone.service.Impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/person1")
public class PersonController {
    @Autowired
    PersonServiceImpl personService;


    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/allPersons")
    public List<Person> getAllPerson() {
        return personService.getAllPersons();
    }
    @PutMapping("/{id}")
    public Person updateCollege(@PathVariable Long id, @RequestBody Person person) {
        person.setId(id);
        return personService.updatePerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }


}



