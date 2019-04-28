package com.example.user.tugasapiprojek.presenter;

import android.content.Context;

import com.example.user.tugasapiprojek.connection.BaseApp;
import com.example.user.tugasapiprojek.model.ResultsItem;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomePresenter {
    private Context context;
    private HomeView homeView;

    public HomePresenter(Context context, HomeView homeView) {
        this.context = context;
        this.homeView = homeView;
    }

    public void loadArticle() {
       BaseApp.service.getMedia().enqueue(new Callback<com.example.user.tugasapiprojek.model.Response>() {


           @Override
           public void onResponse(Call<com.example.user.tugasapiprojek.model.Response> call, Response<com.example.user.tugasapiprojek.model.Response> response) {
               if (response.isSuccessful()) {
                   homeView.onSucces(response.body().getResults());
               } else {
                   homeView.onError(response.message());
               }
           }

           @Override
       public void onFailure(Call<com.example.user.tugasapiprojek.model.Response> call, Throwable t) {
            homeView.onFailure(t.getMessage());
        }
      });
    }
}
