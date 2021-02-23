package repository;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonInMemoryRepositoryImpl implements PersonRepository {

    List<Person> people = new ArrayList();

    @Override
    public Person create(Person person) {
        Long id = new Long(people.size() + 1);
        person.setId(id);
        people.add(person);
        return person;
    }

    @Override
    public Person edit(Long id, Person person) {
        if(people.size() < id || id <= 0) {
            throw new IllegalArgumentException(id + " doesn't not exist");
        } else if(person.getId() != null) {
            if(person.getId() != id.intValue()) {
                throw new IllegalArgumentException(id + " doesn't not exist");
            }
        }

        person.setId(id);
        people.add(id.intValue() - 1, person);
        return person;
    }

    @Override
    public List<Person> list() {
        return people;
    }

    @Override
    public Person getById(Long id) {
        if(people.size() < id || id <= 0) {
            throw new IllegalArgumentException(id + " doesn't not exist");
        }

        Optional<Person> person = people.stream().filter(p -> p.getId() == id.intValue()).findFirst();
        return person.get();
    }
}
