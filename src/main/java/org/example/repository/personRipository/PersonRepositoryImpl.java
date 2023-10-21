package org.example.repository.personRipository;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Person;

public class PersonRepositoryImpl extends BaseRepositoryImpl<Person> implements PersonRepository{
    @Override
    protected Class getClassName() {
        return  Person.class;
    }
}
