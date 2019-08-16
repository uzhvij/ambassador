package com.blogspot.uzhvij.pr_ambassador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.blogspot.uzhvij.pr_ambassador.api_classes.APIBuilder;
import com.blogspot.uzhvij.pr_ambassador.api_classes.AmbassadorApi;
import com.blogspot.uzhvij.pr_ambassador.api_classes.BaseResponse;
import com.blogspot.uzhvij.pr_ambassador.api_classes.LoginBody;
import com.blogspot.uzhvij.pr_ambassador.api_classes.RegistrationBody;
import com.blogspot.uzhvij.pr_ambassador.api_classes.RequestTypes;
import com.blogspot.uzhvij.pr_ambassador.api_classes.SmsBody;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataWorker {
    private static final DataWorker instance = new DataWorker();
    private static final String TAG = "myLogs";
    private static Context mainContext;
    private static AmbassadorApi serverApi;


    private DataWorker() {
        APIBuilder.initialization();
        serverApi = APIBuilder.getApi();
    }

    public static DataWorker getInstance(Context context) {
        mainContext = context;
        return instance;
    }

    public void makeRequest(RequestTypes type) {
        Call<BaseResponse> call = null;
        switch (type) {
            case REGISTRATION:
                call = serverApi.userRegistration(RegistrationBody.getInstance());
                break;
            case SMS:
                SmsBody smsBody = SmsBody.getInstance();
                smsBody.setPhone(User.getInstance().getPhoneNumber());
                call = serverApi.createUserSms(smsBody);
                break;
            case LOGIN:
                call = serverApi.userLogin(LoginBody.getInstance());
                break;
        }
        getResponseData(call);
    }

    private void getResponseData(Call call){
        call.enqueue(new Callback<BaseResponse>() {
                         @Override
                         public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                             try {
                                 Log.d(TAG, "onResponse: " + response.body().getMessage() + " "
                                         + response.body().getCode());
                                 Toast.makeText(mainContext, response.body().getMessage(), Toast.LENGTH_LONG).show();
                             } catch (NullPointerException e) {
                                 Log.d(TAG, "onResponse: error" + e.getMessage());
                                 Toast.makeText(mainContext, "UNSUCCESS", Toast.LENGTH_LONG).show();
                             }
                         }

                         @Override
                         public void onFailure(Call<BaseResponse> call, Throwable t) {
                             Log.d(TAG, "onFailure: " + t.getMessage());
                         }
                     }
        );
    }
}
