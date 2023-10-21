package org.example.repository.tweetRepository;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Tweet;

public class TweetRepositoryImpl extends BaseRepositoryImpl<Tweet> implements TweetRepository{
    @Override
    public void save(Tweet entity) {
        if(entity.getText().length()<240){
            super.save(entity);
           // entity.getPerson().getTweets().add(entity);
        }
        else System.out.println("Error input Text Must Smaller ");
    }

    @Override
    protected Class getClassName() {
        return Tweet.class;
    }
}
