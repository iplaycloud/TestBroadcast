package com.example.iplay.testbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    private final String TAG = "MyReceiver";

    public MyReceiver() {

        Log.i(TAG, "广播注册成功");
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "接收到了广播");

    }
}
