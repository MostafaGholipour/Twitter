package org.example;

import org.example.entity.Person;
import org.example.entity.Tweet;
import org.example.repository.personRipository.PersonRepositoryImpl;
import org.example.repository.tweetRepository.TweetRepositoryImpl;
import org.example.service.personService.PersonServiceImpl;
import org.example.service.tweetService.TweetServiceImpl;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("Mo","M","Mostafa",null);
        Person person1=new Person("Mo","Mpppppppp","Mostafa",null);
        PersonRepositoryImpl personRepository=new PersonRepositoryImpl();
        PersonServiceImpl personService=new PersonServiceImpl(personRepository);
        Tweet tweet=new Tweet();
        tweet.setPerson(person1);
        tweet.setText("55555225");
        TweetRepositoryImpl tweetRepository=new TweetRepositoryImpl();
        TweetServiceImpl tweetService=new TweetServiceImpl(tweetRepository);
        tweetService.save(tweet);
     }
}