package com.example.admin.myapplication;

/**
 * Created by zhongbin on 2016/11/1.
 */

/**
 * 服务端统一返回json type messge
 */
public class Result {
    private String return_code = "";
    private String return_info = "";

    /**
     * 这个json,自己做解析处理
     */
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_info() {
        return return_info;
    }

    public void setReturn_info(String return_info) {
        this.return_info = return_info;
    }
}
