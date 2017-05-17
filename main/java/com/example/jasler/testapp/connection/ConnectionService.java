package com.example.jasler.testapp.connection;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jasler on 5/17/17.
 */

public class ConnectionService {

    public static final String baseURL = "http://192.168.1.35:3000";

    private static OkHttpClient client = new OkHttpClient();

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(baseURL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass){
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);
    }
}
