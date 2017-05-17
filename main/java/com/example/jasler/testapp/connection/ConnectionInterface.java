package com.example.jasler.testapp.connection;

import com.example.jasler.testapp.repository.response.CarListResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jasler on 5/17/17.
 */

public interface ConnectionInterface {

    @GET("data.json")
    Call<CarListResponse> getCarList();
}
