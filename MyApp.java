package com.example.admin.myapplication;

import android.app.Application;
import android.support.multidex.MultiDex;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        MultiDex.install(this);
        super.onCreate();
    }
}
