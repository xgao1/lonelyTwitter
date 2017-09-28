/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta-All Right Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwisw please contant contant@abc.ca.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

import static java.lang.Boolean.TRUE;

/**
 * Represents a tweet.
 *
 * @author team x
 * @Version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable {
    /*
    * Bireaf description of what
     */
    private String message;
    private Date date;
    private List<Mood> moods;
    public Tweet(String message){
        date =new Date();
        this.message=message;
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet (String message, Date date){
        this.date=date;
        this.message=message;
    }


    public Date getDate() {
        return date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * Set the tweet message.
     *
     * @param Message tweet message
     * @throws TweetTooLongException
     */

    public void setMessage(String Message) throws TweetTooLongException{
        if (message .length()<140){
            this.message=message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public abstract Boolean isImportant();



    @Override
    public String toString(){
        return date.toString()+" | "+message;
        //format on the screen
    }
}
