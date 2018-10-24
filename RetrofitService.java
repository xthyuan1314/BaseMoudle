package com.example.admin.myapplication;


import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/8/17.
 */

public interface RetrofitService {



    /**
     * 退出登录
     */
    @POST("phone_log_off")
    Call<Result> logout(
            @Query("shop_id") String shop_code,
            @Query("user_code") String user_code
    );

    @GET("user_login")
    Call<LoginBean> login(@Query("userName") String name,@Query("userPwd") String pwd);



}
