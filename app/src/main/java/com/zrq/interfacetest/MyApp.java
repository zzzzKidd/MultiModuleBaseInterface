package com.zrq.interfacetest;

import android.app.Application;

import com.zrq.firstlibrary.Manager;

/**
 * Created by CAN on 2017/8/9.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Manager.startUp();
    }
}
