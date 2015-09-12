package com.example.kev.weather.util;

/**
 * Created by Kev on 2015/9/11.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
