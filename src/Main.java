import service.PersonService;
import service.PersonServiceImpl;
import model.Person;
import repository.PersonFakeRepository;
import repository.PersonInMemoryRepositoryImpl;
import repository.PersonRepository;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // create an instance of PersonInMemoryRepositoryImpl class
        PersonRepository personRepository = new PersonInMemoryRepositoryImpl();
        PersonRepository personFakeRepository = new PersonFakeRepository();

        // create an instance of PersonServiceImpl class
        // infect the PersonInMemoryRepositoryImpl into PersonServiceImpl
        PersonService personService = new PersonServiceImpl(personRepository);

        Person jane = new Person(null, "Jane", 23);
        Person john = new Person(null, "John", 23);

        Person firstPerson = personService.create(jane);
        System.out.println("Jane: " + firstPerson);
        Person secondPerson = personService.create(john);
        System.out.println("John: " + secondPerson);

    }
}

