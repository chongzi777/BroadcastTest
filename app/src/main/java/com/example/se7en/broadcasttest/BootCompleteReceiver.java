package com.example.se7en.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 开机完成接收器
 * Created by se7en on 2016/1/28.
 */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"boot complete",Toast.LENGTH_SHORT).show();
    }
}
