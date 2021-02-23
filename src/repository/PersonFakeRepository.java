package repository;

import model.Person;

import java.util.List;

public class PersonFakeRepository implements PersonRepository {
    @Override
    public Person create(Person person) {
        return new Person(5L, "Jane", 23);
    }

    @Override
    public Person edit(Long id, Person person) {
        return new Person(5L, "Jane", 23);
    }

    @Override
    public Person getById(Long id) {
        return new Person(id, "Jane", 23);
    }

    @Override
    public List<Person> list() {
        return null;
    }
}
