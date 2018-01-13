package com.example.wpn50.pennstateartscrawl;

/**
 * Created by wpn50 on 1/11/2018.
 */

public class Event {
    //initialize all elements to build an event
    private String mMessage;
    private int mStartTimeId;
    private int mHeight;

    //build constructor
    public Event(int startTimeId, int height, String message){
        mStartTimeId = startTimeId;
        mHeight = height;
        mMessage = message;
    }

    //create methods to return the values
    public int getStartTimeId(){return mStartTimeId;}

    public int getHeight(){return mHeight;}

    public String getMessage(){return mMessage;}
}
