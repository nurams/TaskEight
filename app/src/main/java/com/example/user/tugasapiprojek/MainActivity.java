package com.example.user.tugasapiprojek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.user.tugasapiprojek.adapter.ArticleAdapter;
import com.example.user.tugasapiprojek.connection.BaseApp;
import com.example.user.tugasapiprojek.model.MediaItem;
import com.example.user.tugasapiprojek.model.Response;
import com.example.user.tugasapiprojek.model.ResultsItem;
import com.example.user.tugasapiprojek.presenter.HomePresenter;
import com.example.user.tugasapiprojek.presenter.HomeView;
import com.example.user.tugasapiprojek.connection.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity implements HomeView {
    private RecyclerView recyclerView;
    private ArticleAdapter articleAdapter;
    private HomePresenter homePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rec_artikel);
        homePresenter = new HomePresenter(this,this);
        homePresenter.loadArticle();
    }

    @Override
    public void onSucces(List<ResultsItem> mediaItemList) {
        articleAdapter = new ArticleAdapter(getApplicationContext(),mediaItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(articleAdapter);
        articleAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, "onError" + errorMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, "onFailure" + failureMessage, Toast.LENGTH_SHORT).show();
        Log.d("error", failureMessage);
    }
}
