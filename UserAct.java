package com.example.admin.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.myapplication.databinding.ActUserBinding;

public class UserAct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActUserBinding binding= DataBindingUtil.setContentView(this,R.layout.act_user);
        User user = new User("xth","xxx");
        binding.setUser(user);
    }
}
