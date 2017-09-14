package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xgao1 on 9/13/17.
 */

public abstract class Mood {
    private String mood;
    private Date date;

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mood(){
        date= new Date();
    }

    public Mood(Date date){
        this.date=date;
    }

    public abstract String printMood();
}
