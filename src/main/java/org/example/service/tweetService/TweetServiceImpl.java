package org.example.service.tweetService;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.Tweet;
import org.example.repository.tweetRepository.TweetRepositoryImpl;

public class TweetServiceImpl extends BaseServiceImpl<Tweet, TweetRepositoryImpl> implements TweetService {
    public TweetServiceImpl(TweetRepositoryImpl repository) {
        super(repository);
    }
}
