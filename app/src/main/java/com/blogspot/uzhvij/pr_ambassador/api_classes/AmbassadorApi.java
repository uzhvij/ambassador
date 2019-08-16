package com.blogspot.uzhvij.pr_ambassador.api_classes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AmbassadorApi {
    @POST("create_user_sms.php")
    Call<SmsResponse> createUserSms(@Body SmsBody smsBody);

    @POST("login.php")
    Call<LoginResponse> userLogin(@Body LoginBody loginBody);
}
