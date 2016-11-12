package eu.leeuwis.microprofile.liberty.twitter.service

import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class TweetBusinessImpl
@Inject
constructor(private val tweetDAO: TweetDAO) : TweetBusiness {

    override fun retrieveTweets(): String {
        val tweets = tweetDAO.retrieveTweets().joinToString()
        return "These are my tweets: ${tweets}"
    }
}
