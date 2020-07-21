package com.example.knowitall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {
    private static final String DATE_TIME_SEPARATOR = "T";
    public NewsAdapter(@NonNull Context context, @NonNull ArrayList<News> newsArrayList) {
        super(context, 0, newsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView topicTextView = listItemView.findViewById(R.id.topic);
        topicTextView.setText(currentNews.getTopic());

        TextView newsTextView = listItemView.findViewById(R.id.actualNews);
        newsTextView.setText(currentNews.getNews());

        String originalDateTime = currentNews.getDate();
        String date = null;
        String time = null;
        if(originalDateTime.contains(DATE_TIME_SEPARATOR)){
            String[] parts = originalDateTime.split(DATE_TIME_SEPARATOR);
            date = parts[0];
            time = parts[1];
            time = time.replace("Z", " ");
        }

        TextView dateTextView = listItemView.findViewById(R.id.date);
        dateTextView.setText(date);

        TextView timeTextView = listItemView.findViewById(R.id.time);
        timeTextView.setText(time);

        return listItemView;
    }
}
