package com.zignuts.samplebootcompleted;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {

    public static final String TAG = "BootCompletedSample";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive");
        Log.e(TAG, "action " + intent.getAction());
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            MyService.enqueueWork(context, new Intent());
        }
    }

}