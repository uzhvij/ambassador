package com.blogspot.uzhvij.pr_ambassador.api_classes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIBuilder {
    private static AmbassadorApi ambassadorApi;

    public static void initialization() {
        String uri = "https://pr-ambassador.com/api/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(uri)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ambassadorApi = retrofit.create(AmbassadorApi.class);
    }

    public static AmbassadorApi getApi() {
        return ambassadorApi;
    }
}
