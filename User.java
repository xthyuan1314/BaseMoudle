package com.example.admin.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable{
    private String firstName;
    private String lastName;
    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
