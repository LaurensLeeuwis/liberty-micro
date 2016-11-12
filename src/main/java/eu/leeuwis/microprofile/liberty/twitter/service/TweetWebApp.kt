package eu.leeuwis.microprofile.liberty.twitter.service

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType.TEXT_HTML

@Path("/tweet")
class TweetWebApp {

    @Inject
    private var tweetBusiness: TweetBusiness? = null

    @GET
    @Path("/retrieve")
    @Produces(TEXT_HTML)
    fun info(): String {
        return tweetBusiness!!.retrieveTweets()
    }

}
