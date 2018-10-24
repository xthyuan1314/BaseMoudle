package com.example.admin.myapplication;

import android.content.Context;
import android.util.Log;


import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2016/11/14.
 * 请求回调的控制类，对返回的回调
 */
public abstract class RequestCallback<T> implements Callback<T> {

    private final String TAG = "RequestCallback";

    public abstract void onSuccess(Context context, T call);

//    public PtrFrameLayout ptr;


    private Context context;
//    private MProgressDialog mProgressDialog;

//    public RequestCallback(Context context, PtrFrameLayout ptr, final MProgressDialog mProgressDialog) {
//        this.context = context;
//        this.ptr = ptr;
//        this.mProgressDialog = mProgressDialog;
//    }

//    public RequestCallback(Context context, PtrFrameLayout ptr) {
//        this.ptr = ptr;
//        this.context = context;
//    }
//
//    public RequestCallback(Context context, MProgressDialog mProgressDialog) {
//        this.context = context;
//        this.mProgressDialog = mProgressDialog;
//    }
//
//    public RequestCallback(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public void onFailure(Call<T> call, Throwable t) {
//        Log.e(TAG, t.toString());
//        if (t instanceof ApiException) {
//            if (StringUtils.isEmpty(((ApiException) t).getMsg())) {
//                ToastUtils.showToast(context, "失败了呢，重新试试看哦");
//            } else {
//                ToastUtils.showToast(context, ((ApiException) t).getMsg());
//            }
//        } else if (t instanceof SocketTimeoutException) {
//            ToastUtils.showToast(context, "网络请求超时，请重试");
//        } else if (t instanceof ConnectException || t instanceof UnknownHostException) {
//            ToastUtils.showToast(context, "网络异常，请检查您的网络");
//        } else {
//            ToastUtils.showToast(context, "失败了呢，重新试试看哦");
//        }
//
//        if (ptr != null) {
//            ptr.refreshComplete();
//        }
//
//        if (mProgressDialog != null) {
//            mProgressDialog.dismiss();
//        }
//
//    }
//
//    @Override
//    public void onResponse(Call<T> call, Response<T> response) {
//
//
//        if (mProgressDialog != null) {
//            mProgressDialog.dismiss();
//        }
//
//
//        if (ptr != null) {
//            ptr.refreshComplete();
//        }
//
//        if (response.body() == null) {
//            onFailure(call, new NullPointerException());
//        } else {
//            onSuccess(context, response.body());
//        }
//
//    }
}
