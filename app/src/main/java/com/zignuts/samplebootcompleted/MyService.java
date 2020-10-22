package com.zignuts.samplebootcompleted;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

public class MyService extends JobIntentService {

    public static final int JOB_ID = 0x01;

    public static void enqueueWork(Context context, Intent work) {
        Log.e(BootReceiver.TAG, "enqueueWork");
        enqueueWork(context, MyService.class, JOB_ID, work);
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        // your code
        Log.e(BootReceiver.TAG, "onHandleWork");
        Toast.makeText(getApplicationContext(), "Boot receive completed", Toast.LENGTH_LONG).show();
    }

}