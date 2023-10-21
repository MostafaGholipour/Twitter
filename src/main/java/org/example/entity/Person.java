package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Person extends BaseEntity {
    private String username;
    private String password;
    private String name;
    private Date Age;
    //private List<Tweet> tweets= new ArrayList<>();

    public Person(String username, String password, String name, Date age) {
        this.username = username;
        this.password = password;
        this.name = name;
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id " + getId() +'\''+
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
