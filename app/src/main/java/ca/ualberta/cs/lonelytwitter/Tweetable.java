/*
 *Tweetable
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

public interface Tweetable {
    /**
     * return message
     *
     * @return
     */
    public String getMessage();

    /**
     * return date
     *
     * @return
     */
    public Date getDate();
}
