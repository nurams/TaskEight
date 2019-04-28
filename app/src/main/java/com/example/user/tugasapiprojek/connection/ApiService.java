package com.example.user.tugasapiprojek.connection;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.user.tugasapiprojek.model.Response;
import com.example.user.tugasapiprojek.model.ResultsItem;

public interface ApiService {
    @GET("v1/trending")
    Call<Response> getMedia();
}
