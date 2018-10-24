package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> datas;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_reclistview);

        initData();


    }

    private void initData() {
        datas= new ArrayList<String>();

        for(int i =0;i<10;i++){
            datas.add("item"+i);
        }
    }
}
