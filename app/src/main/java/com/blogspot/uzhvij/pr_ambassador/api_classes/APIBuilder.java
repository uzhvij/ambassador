package com.blogspot.uzhvij.pr_ambassador.api_classes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIBuilder {
    private static AmbassadorApi ambassadorApi;
    private static Retrofit retrofit;
    private static String uri = "https://pr-ambassador.com/api/";

    public static void initialization(){
        retrofit = new Retrofit.Builder().baseUrl(uri)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ambassadorApi = retrofit.create(AmbassadorApi.class);
    }

    public static AmbassadorApi getApi(){
        return ambassadorApi;
    }
}
