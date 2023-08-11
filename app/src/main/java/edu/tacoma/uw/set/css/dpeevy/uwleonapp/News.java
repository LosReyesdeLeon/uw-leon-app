package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class News extends AppCompatActivity {
    RecyclerView recyclerView;
    List<NewsArticle> dataList;
    NewsAdapter adapter;
    NewsArticle androidData;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        recyclerView = findViewById(R.id.recyclerView);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(News.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new NewsArticle(R.string.title_one,"2023-06-29",R.mipmap.uw_mobile_apps_news_image_foreground);
        dataList.add(androidData);

        androidData = new NewsArticle(R.string.title_two,"2019-02-07",R.mipmap.uw_leon_headquarters_2023);
        dataList.add(androidData);

        adapter = new NewsAdapter(News.this, dataList);
        recyclerView.setAdapter(adapter);
    }
}