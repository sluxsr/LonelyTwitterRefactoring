package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet {
	private Tweet tweet;
	private static final long serialVersionUID = 1L;
	private final MySerializable serializable = new MySerializable();

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweet.setTweetDate(date);
		this.tweet.setTweetBody(text);
	}

	private class MySerializable implements Serializable {
	}
}