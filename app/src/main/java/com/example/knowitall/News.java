package com.example.knowitall;

public class News {
    private String mTopic;
    private String mNews;
    private String mDate;
    private String mTime;

    public News(String topic, String news, String date, String time){
        mTopic = topic;
        mNews = news;
        mDate = date;
        mTime = time;
    }

    public String getTopic(){
        return mTopic;
    }

    public String getNews(){
        return mNews;
    }

    public String getDate(){
        return mDate;
    }

    public String getTime(){
        return mTime;
    }
}
