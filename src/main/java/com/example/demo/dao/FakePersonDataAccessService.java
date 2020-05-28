package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//so its a bean that can be injected
@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDAO {

    private static List<Person> DB = new ArrayList<>();



    @Override
    public int insertPerson( UUID id,Person person) {

        DB.add(new Person(id,person.getName()));
        return 1;
    }
}
