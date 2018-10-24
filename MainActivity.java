package com.example.admin.myapplication;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.admin.myapplication.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        GlideApp.with(this).load("").fitCenter().into(binding.imageView2);

        try {
            RetrofitService retrofit = RetrofitUtils.createService();
            Call<LoginBean> call = retrofit.login("gulx", "aabb1122");
            call.enqueue(new RequestCallback<LoginBean>() {
                @Override
                public void onSuccess(Context context, LoginBean call) {

                }

                @Override
                public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {

                }

                @Override
                public void onFailure(Call<LoginBean> call, Throwable t) {

                }
            });
            call.enqueue(new Callback<LoginBean>() {
                @Override
                public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                    try {
                        Log.e("tag ", "userid:" + response.body().getUserID());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<LoginBean> call, Throwable t) {
                    t.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
