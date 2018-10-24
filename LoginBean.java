package com.example.admin.myapplication;

public class LoginBean {

    private String UserID;
    private String UserName;
    private String site_id;
    private String site_name;
    private String UserSafety;
    private String rf_role;

    public String getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getSite_id() {
        return site_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public String getUserSafety() {
        return UserSafety;
    }

    public String getRf_role() {
        return rf_role;
    }


    @Override
    public String toString() {
        return "LoginBean{" +
                "UserID='" + UserID + '\'' +
                ", UserName='" + UserName + '\'' +
                ", site_id='" + site_id + '\'' +
                ", site_name='" + site_name + '\'' +
                ", UserSafety='" + UserSafety + '\'' +
                ", rf_role='" + rf_role + '\'' +
                '}';
    }
}
