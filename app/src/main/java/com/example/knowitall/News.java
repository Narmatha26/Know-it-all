package com.example.knowitall;

public class News {
    private String mTopic;
    private String mNews;
    private String mDate;
    private String mUrl;

    public News(String topic, String news, String date, String url){
        mTopic = topic;
        mNews = news;
        mDate = date;
        mUrl = url;
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

    public String getUrl() {
        return mUrl;
    }

}
