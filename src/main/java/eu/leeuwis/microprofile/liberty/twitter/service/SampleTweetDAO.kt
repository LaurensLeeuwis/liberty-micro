package eu.leeuwis.microprofile.liberty.twitter.service

import eu.leeuwis.microprofile.liberty.twitter.model.Tweet
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class SampleTweetDAO : TweetDAO {

    override fun retrieveTweets(): Iterable<Tweet> {
        return setOf(Tweet("@LaurensLeeuwis", "MyTweet", "yesterday"),
                     Tweet("@kotlin", "cool tweet", "2 days ago"))
    }

}
