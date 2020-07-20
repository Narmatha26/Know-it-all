package com.example.knowitall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ArrayList<News> newsArrayList = new ArrayList<>();
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));
        newsArrayList.add(new News("Politics", "Shamima Begum ruling reignites " +
                "debate over Britons who joined Isis", "2020-07-20","07:05:00"));

        ListView newsListView = findViewById(R.id.list);
        NewsAdapter newsAdapter = new NewsAdapter(this, newsArrayList);
        newsListView.setAdapter(newsAdapter);
    }
}
