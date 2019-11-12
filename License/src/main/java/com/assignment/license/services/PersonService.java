package com.assignment.license.services;

import com.assignment.license.models.Person;
import com.assignment.license.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> allPerson() {
        return personRepository.findAll();
    }

    public Person CreatePerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPerson(Long id) {
        Optional<Person> person = personRepository.findById(id);
        return person.get();
    }
}
