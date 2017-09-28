/*
 * Mood
 *
 * Version 1.0
 *
 * September 27. 2017
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

public abstract class Mood {
    private String mood;
    private Date date;

    /**
     * return the date
     *
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * to type in the date
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }


    public Mood(){
        date= new Date();
    }

    /**
     * store the input date in Mood
     *
     * @param date date
     */
    public Mood(Date date){
        this.date=date;
    }

    /**
     * display the mood
     *
     * @return
     */
    public abstract String printMood();
}
