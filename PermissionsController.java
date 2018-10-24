/*
package com.example.admin.myapplication;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;

import java.util.List;

public class PermissionsController {
    private static final String TAG = "PermissionsTag";
    private static PermissionsController sInstance;
    private final Context mContext;
    // 权限回调监听
    private final SparseArray<PermissionsResultCallback> mRequestIdToCallback = new SparseArray<>();


    public PermissionsController(Context context) {
        mContext = context.getApplicationContext();
    }

    @Nonnull
    public static synchronized PermissionsController get(@Nonnull Context context) {
        if (sInstance == null) {
            sInstance = new PermissionsController(context);
        }
        return sInstance;
    }

    */
/**
     * 请求权限；封装了键盘和常规请求
     *
     * @param callback 申请权限回调，不能为空
     * @param activity 权限处理activity，键盘区传null，其他非空
     * @param permissionsToRequest 需要申请的权限，多个权限可组合同时申请
     *//*

    public synchronized void requestPermissions(@Nonnull PermissionsResultCallback callback,
                                                Activity activity,
                                                int requestId,
                                                String... permissionsToRequest) {
        List<String> deniedPermissions = getDeniedPermissions(mContext, permissionsToRequest);
        if (deniedPermissions.isEmpty()) {
            // 被拒绝的权限为空，直接回调成功
            callback.onPermissionsGranted(requestId, deniedPermissions);
            return;
        }

        String[] permissionsArray = deniedPermissions.toArray(
                new String[deniedPermissions.size()]);

        if (activity != null) {
            String rationale = activity.getString(R.string.permission_msg);
            requestPermissions(activity, rationale, requestId, permissionsArray);
        } else {
            mRequestIdToCallback.put(requestId, callback);
            PermissionsActivity.run(mContext, requestId, permissionsArray);
        }
    }

    */
/**
     * 常规请求方式，用于在activity中
     *
     * @param host 权限处理activity
     * @param rationale 权限申请解释文本，仅当用户拒绝首次后才能弹出
     * @param requestCode 权限申请request code
     * @param perms 需要申请的权限，多个权限可组合同时申请
     *//*

    public static void requestPermissions(
            @NonNull Activity host, @NonNull String rationale,
            int requestCode, @NonNull String... perms) {
        EasyPermissions.requestPermissions(host, rationale, requestCode, perms);
    }

    */
/**
     * 申请成功回调
     *
     * @param requestCode 权限申请request code
     * @param perms 授权成功权限
     *//*

    public synchronized void onPermissionsGranted(int requestCode, List<String> perms) {
        PermissionsResultCallback permissionsResultCallback = mRequestIdToCallback.get(requestCode);
        mRequestIdToCallback.remove(requestCode);
        if (permissionsResultCallback != null) {
            permissionsResultCallback.onPermissionsGranted(requestCode, perms);
        }
    }

    */
/**
     * 申请失败回调
     *
     * @param requestCode 权限申请request code
     * @param perms 授权失败权限
     *//*

    public synchronized void onPermissionsDenied(int requestCode, List<String> perms) {
        PermissionsResultCallback permissionsResultCallback = mRequestIdToCallback.get(requestCode);
        mRequestIdToCallback.remove(requestCode);
        if (permissionsResultCallback != null) {
            permissionsResultCallback.onPermissionsDenied(requestCode, perms);
        }
    }

    */
/**
     *  权限申请结果处理，需在activity onRequestPermissionsResult回调中调用
     * @param requestCode 权限申请request code
     * @param permissions 申请的权限
     * @param grantResults 授权结果
     * @param receivers 授权结果处理
     *//*

    public static void onRequestPermissionsResult(int requestCode,
                                                  @NonNull String[] permissions,
                                                  @NonNull int[] grantResults,
                                                  @NonNull Object... receivers){
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, receivers);
    }

    */
/**
     * 存在一些权限被永久的拒绝
     *
     * @param host
     * @param deniedPermissions
     * @return
     *//*

    public static boolean somePermissionPermanentlyDenied(@NonNull Activity host,
                                                          @NonNull List<String> deniedPermissions) {
        return EasyPermissions.somePermissionPermanentlyDenied(host, deniedPermissions);
    }


    */
/**
     * 展示跳转设置页提示窗
     *
     * @param host
     *//*

    public static void showAppSettingDialog(@NonNull Activity host) {
        new AppSettingsDialog.Builder(host).build().show();
    }


    */
/**
     * 是否已获取当前权限
     *
     * @param context
     * @param perms
     * @return
     *//*

    public static boolean hasPermissions(Context context, @NonNull String... perms) {
        return EasyPermissions.hasPermissions(context, perms);
    }

    */
/**
     * 获取未授权权限
     *
     * @param context
     * @param permissions
     * @return
     *//*

    public static List<String> getDeniedPermissions(Context context, String... permissions) {
        final List<String> deniedPermissions = new ArrayList<String>();
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(context, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                deniedPermissions.add(permission);
            }
        }
        return deniedPermissions;
    }

    */
/**
     * 权限回调接口，直接继承 EasyPermissions.PermissionCallbacks
     *//*

    public interface PermissionsResultCallback extends EasyPermissions.PermissionCallbacks{

    }

}
*/
