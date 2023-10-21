package org.example.service.personService;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.Person;
import org.example.repository.personRipository.PersonRepositoryImpl;

public class PersonServiceImpl extends BaseServiceImpl<Person, PersonRepositoryImpl> implements PersonService  {
    public PersonServiceImpl(PersonRepositoryImpl repository) {
        super(repository);
    }
}
