package ca.ualberta.cs.lonelytwitter;

public class ImpTweet extends Tweet {
    public int getName() {
        return name;
    }

    int name;

    public boolean isValidBody() {
        if (tweetBody.trim().length() == 0
            || tweetBody.trim().length() <100) {
            return false;
        }
        return true;
    }
}
