package com.zrq.interfacetest;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.zrq.firstlibrary.Manager;
import com.zrq.secondlibrary.TextCreator;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);TextView textView = (TextView) findViewById(R.id.tv);

        TextCreator textCreator = new TextCreator();

        textView.setText(getCurrentProcessName(this)+":SecondActivity\n"+Manager.getInstance().genText("firstlibrary.Manager")
                +"\n"+textCreator.getText("secondlibrary.TextCreator"));
    }
    /**
     * 获取当前进程名
     */
    private static String getCurrentProcessName(Context context) {
        int pid = android.os.Process.myPid();
        ActivityManager mActivityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo appProcess : mActivityManager.getRunningAppProcesses()) {
            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }
}
