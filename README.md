# Liberty Micro
This year, I've attended Devoxx in Belgium. One of the talks was about [microprofile](http://www.microprofile.io). The talk itself can be watched on [Youtube](https://www.youtube.com/watch?v=iG-XvoIfKtg).

I'm working on a project where we deploy to IBM Websphere. During the microprofile talk, I saw the IBM Liberty Microprofile service. With that as inspiration, and always wanting to do something with Kotlin, I've created this little dummy project.

Build:
	
	mvn clean install
	
Run:

	java -jar target/liberty-micro-twitter.jar
	
And then visit [`http://localhost:7070/tweet/retrieve`](http://localhost:7070/tweet/retrieve) in your favorite browser.
	
Good luck ;)