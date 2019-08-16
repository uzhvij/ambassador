package com.blogspot.uzhvij.pr_ambassador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.blogspot.uzhvij.pr_ambassador.api_classes.APIBuilder;
import com.blogspot.uzhvij.pr_ambassador.api_classes.SmsBody;
import com.blogspot.uzhvij.pr_ambassador.api_classes.SmsResponse;
import com.blogspot.uzhvij.pr_ambassador.api_classes.LoginBody;
import com.blogspot.uzhvij.pr_ambassador.api_classes.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataWorker {
    private static final DataWorker instance = new DataWorker();
    private static final String TAG = "myLogs";
    private static Context mainContext;

    private DataWorker() {
        APIBuilder.initialization();
    }

    public static DataWorker getInstance(Context context){
        mainContext = context;
        return instance;
    }

    public void getSms(){
        SmsBody smsBody = SmsBody.getInstance();
        smsBody.setPhone(User.getInstance().getPhoneNumber());
        APIBuilder.getApi().createUserSms(smsBody).enqueue(
                new Callback<SmsResponse>() {
                    @Override
                    public void onResponse(Call<SmsResponse> call, Response<SmsResponse> response) {
                        Log.d(TAG, "onResponse: " + response.body().getMessage() + " "
                                + response.body().getCode());
                    }

                    @Override
                    public void onFailure(Call<SmsResponse> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                }
        );
    }

    public void startLogin(){
        APIBuilder.getApi().userLogin(LoginBody.getInstance()).enqueue(
                new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        try {
                            Log.d(TAG, "onResponse: " + response.body().getMessage() + " "
                                    + response.body().getCode());
                            Toast.makeText(mainContext, response.body().getMessage(), Toast.LENGTH_LONG).show();
                        }catch (NullPointerException e){
                            Toast.makeText(mainContext, "UNSUCCESS", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        Log.d(TAG, "onFailure: " + t.getMessage());
                    }
                }
        );
    }
}
