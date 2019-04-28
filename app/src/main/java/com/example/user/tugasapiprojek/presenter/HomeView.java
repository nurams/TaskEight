package com.example.user.tugasapiprojek.presenter;

import com.example.user.tugasapiprojek.model.Response;
import com.example.user.tugasapiprojek.model.ResultsItem;
import com.example.user.tugasapiprojek.model.MediaItem;

import java.util.List;

public interface HomeView {
    void onSucces(List<ResultsItem> mediaItemList);
    void onError(String errorMessage);
    void onFailure(String failureMessage);


}
