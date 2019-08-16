package com.blogspot.uzhvij.pr_ambassador;

import android.util.Log;

import com.blogspot.uzhvij.pr_ambassador.api_classes.APIBuilder;
import com.blogspot.uzhvij.pr_ambassador.api_classes.CreateUserSmsBody;
import com.blogspot.uzhvij.pr_ambassador.api_classes.CreateUserSmsRespons;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataWorker {
    private static final DataWorker instance = new DataWorker();
    private User user;
    private static final String TAG = "myLogs";

    private DataWorker() {
        user = User.getInstance();
        APIBuilder.initialization();
    }

    public static DataWorker getInstance(){
        return instance;
    }

    public void startRegistration(String phoneNumber){
        user.setPhoneNumber(phoneNumber);
        APIBuilder.getApi().createUserSms(CreateUserSmsBody.getInstance()).enqueue(
                new Callback<CreateUserSmsRespons>() {
                    @Override
                    public void onResponse(Call<CreateUserSmsRespons> call, Response<CreateUserSmsRespons> response) {
                        Log.d(TAG, "onResponse: " + response.body().getMessage() + " "
                                + response.body().getCode());
                    }

                    @Override
                    public void onFailure(Call<CreateUserSmsRespons> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                }
        );
    }
}
