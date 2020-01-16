package com.example.admin.retrofitget;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by admin on 9/16/2019.
 */

public interface OurRetrofit {

    @GET("1d1lx9")
        Call<List<DataSet>> getDataset();
}
