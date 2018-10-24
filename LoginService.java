package com.example.admin.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LoginService {

    @POST("/pdfwlservice_new.asmx/user_login")
    Call<ResponseBody> getLogin(@Query("userName") String username, @Query("userPwd") String pwd);
}
