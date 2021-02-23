package service;

import model.Person;
import repository.PersonRepository;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;


    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person create(Person person) {
        return personRepository.create(person);
    }

    @Override
    public Person edit(Long id, Person person) {
        return personRepository.edit(id, person);
    }

    @Override
    public Person getById(Long id) {
        return personRepository.getById(id);
    }

    @Override
    public List<Person> list() {
        return personRepository.list();
    }
}
