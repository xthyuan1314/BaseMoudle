/*
package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.List;

public class PermissionsActivity extends Activity implements PermissionsController.PermissionsResultCallback {
    private static final String TAG = "PermissionsActivity";
    // 需要请求的权限
    public static final String EXTRA_PERMISSION_REQUESTED_PERMISSIONS = "requested_permissions";
    // 请求权限的requestCode
    public static final String EXTRA_PERMISSION_REQUEST_CODE = "request_code";
    // 默认无效requestCode
    private static final int INVALID_REQUEST_CODE = -1;

    private int mPendingRequestCode = INVALID_REQUEST_CODE;


    */
/**
     * 启动一个权限Activity,并立即请求权限
     *
     * @param context
     * @param requestCode
     * @param permissionStrings
     *//*

    public static void run(
            @NonNull Context context, int requestCode, @NonNull String... permissionStrings) {
        Intent intent = new Intent(context.getApplicationContext(), PermissionsActivity.class);
        intent.putExtra(EXTRA_PERMISSION_REQUESTED_PERMISSIONS, permissionStrings);
        intent.putExtra(EXTRA_PERMISSION_REQUEST_CODE, requestCode);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPendingRequestCode = (savedInstanceState != null)
                ? savedInstanceState.getInt(EXTRA_PERMISSION_REQUEST_CODE, INVALID_REQUEST_CODE)
                : INVALID_REQUEST_CODE;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(EXTRA_PERMISSION_REQUEST_CODE, mPendingRequestCode);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mPendingRequestCode == INVALID_REQUEST_CODE) {
            final Bundle extras = getIntent().getExtras();
            final String[] permissionsToRequest =
                    extras.getStringArray(EXTRA_PERMISSION_REQUESTED_PERMISSIONS);
            mPendingRequestCode = extras.getInt(EXTRA_PERMISSION_REQUEST_CODE);
            PermissionsController.requestPermissions(this, getString(R.string.permission_msg), mPendingRequestCode,
                    permissionsToRequest);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[]
            grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionsController.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
        mPendingRequestCode = INVALID_REQUEST_CODE;
    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {
        PermissionsController.get(this).onPermissionsGranted(requestCode, perms);
        finish();
    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {
        PermissionsController.get(this).onPermissionsDenied(requestCode, perms);
        if (PermissionsController.somePermissionPermanentlyDenied(this, perms)) {
            if (BuildConfig.DEBUG) {
                Log.d("PermissionsTag", "存在一些权限被永久的拒绝");
            }
            PermissionsController.showAppSettingDialog(this);
        }
        finish();
    }
}
*/
