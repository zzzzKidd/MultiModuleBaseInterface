package com.zrq.baselibrary;

/**
 * Created by CAN on 2017/8/9.
 */

public class Assist {
    private static ManagerInterface assist;

    public static void startUp(ManagerInterface assist) {
        Assist.assist = assist;
    }

    public static String genText(String s) {
        if (Assist.assist == null) return "";
        return Assist.assist.genText(s);
    }
}
