package service;

import model.Person;

import java.util.List;

public interface PersonService {
    Person create(Person person);
    Person edit(Long id, Person person);
    Person getById(Long id);
    List<Person> list();
}
