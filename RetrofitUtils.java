package com.example.admin.myapplication;

import android.util.Log;

import com.example.admin.myapplication.converter.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;


/**
 * Created by Administrator on 2016/11/9.
 */
public class RetrofitUtils {
    private final static String TAG = "RetrofitUtils";
    //测试
    private final static String BASE_URL = "http://hapi.554488.com/pdfwlservice_new.asmx/";

    protected static Retrofit mRetrofit;
    /**
     * 链接时长10S
     */
    protected final static Long TIME_OUT = 10L;


    private static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            synchronized (RetrofitUtils.class) {
                if (mRetrofit == null) {

                    OkHttpClient client = new OkHttpClient.Builder()
                            .addInterceptor(
                                    new HttpLoggingInterceptor(message -> Log.e(TAG, message)).setLevel(HttpLoggingInterceptor.Level.BASIC))
                            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                            .build();

                    mRetrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(client)
                            .build();
                }
            }
        }

        return mRetrofit;
    }


    /**
     * 根据interface 接口创建相应的class
     */
    public static RetrofitService createService() {
        return getRetrofit().create(RetrofitService.class);
    }


}
