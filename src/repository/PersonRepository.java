package repository;

import model.Person;

import java.util.List;

public interface PersonRepository {
    Person create(Person person);
    Person edit(Long id, Person person);
    Person getById(Long id);
    List<Person> list();
}
