package com.blogspot.uzhvij.pr_ambassador.api_classes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AmbassadorApi {
    /*@POST("api/{method}")
    Call<List<PostModel>> getData(@Path("method") String method, @Query("name") String resourceName, @Query("num") int count);*/

    @POST("create_user_sms.php")
    Call<CreateUserSmsRespons> createUserSms(@Body CreateUserSmsBody createUserSmsBody);
}
