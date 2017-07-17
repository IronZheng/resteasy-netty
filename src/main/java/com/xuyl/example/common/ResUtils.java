package com.xuyl.example.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by dell on 2017/7/17.
 * @Author zhenggangmin
 */
public class ResUtils {

    private static Gson gson = new GsonBuilder().create();

    public static String transToJson(Object obj) {
        return gson.toJson(obj);
    }

}
