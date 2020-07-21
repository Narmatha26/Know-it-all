package com.example.knowitall;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private String mUrl;
    public NewsLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public List<News> loadInBackground() {
        if(mUrl == null){
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsFeed(mUrl);
        return newsList;
    }
}
