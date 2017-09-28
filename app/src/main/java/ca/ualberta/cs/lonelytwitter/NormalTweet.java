/*
 *NormalTweet
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
/*
 * Created by xgao1 on 9/13/17.
 */

public class NormalTweet extends Tweet{
    /**
     * Construct the message
     *
     * @param message string
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs message and date
     *
     * @param message string
     * @param date date
     */
    public NormalTweet(String message, Date date){
        super(message,date);

    }
    @Override
    /* return False to show it is not important*/
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
