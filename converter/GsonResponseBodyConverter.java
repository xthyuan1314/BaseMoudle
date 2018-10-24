/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.admin.myapplication.converter;

import android.util.Log;

import com.example.admin.myapplication.ApiException;
import com.example.admin.myapplication.LoginBean;
import com.example.admin.myapplication.Result;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Author: TinhoXu
 * E-mail: xth@erongdu.com
 * Date: 2016/4/6 9:35
 * <p/>
 * Description:  JSON response 解析
 */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final String TAG = "HttpRequest";

    private final Gson gson;
    private final TypeAdapter<T> adapter;
    private final Type type;

    GsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter, Type type) {
        this.gson = gson;
        this.adapter = adapter;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        // NetworkUtil.dismissCutscenes();
        String response = value.string().trim();
        Log.e("tag","xth:"+response);
        // 解析resCode和resMsg
        LoginBean httpResult = gson.fromJson(response, LoginBean.class);


//        if (!httpResult.getReturn_code().equals("1")) {
//            throw new ApiException(Integer.parseInt(httpResult.getReturn_code()), httpResult.getReturn_info());
//        }
//
//        //如果请求返回类是HttpResult 那么直接返回
//        if (type == Result.class) {
//            httpResult.setBody(response);
//            return (T) httpResult;
//        }

        try {
            //String str = new JSONObject(response).getString("return_data");
            String str =response;
            // 在debug模式下输出返回数据
            /**
             * 部分接口特殊返回处理
             */

            StringReader reader = new StringReader(str);
            JsonReader jsonReader = gson.newJsonReader(reader);
            return adapter.read(jsonReader);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return null;
        } finally {
            value.close();
        }
    }
}
