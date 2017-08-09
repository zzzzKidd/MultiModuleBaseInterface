package com.zrq.firstlibrary;

import com.zrq.baselibrary.Assist;
import com.zrq.baselibrary.ManagerInterface;

/**
 * Created by CAN on 2017/8/9.
 */

public class Manager extends ManagerInterface {
    public static Manager getInstance() {
        return instance;
    }

    private static Manager instance;

    public static void startUp() {
        if (instance == null) {
            instance = new Manager();
        }
        Assist.startUp(instance);
    }

    @Override
    public String genText(String s) {
        return s;
    }
}
