package eu.leeuwis.microprofile.liberty.twitter.service

import eu.leeuwis.microprofile.liberty.twitter.model.Tweet

interface TweetDAO {
    fun retrieveTweets(): Iterable<Tweet>
}
