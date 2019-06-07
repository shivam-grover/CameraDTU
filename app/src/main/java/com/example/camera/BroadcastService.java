package com.example.camera;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BroadcastService extends Service
{
    MainActivity alarm = new MainActivity();
    public void onCreate()
    {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        alarm.setAlarm(this);
        return START_STICKY;
    }

    @Override
    public void onStart(Intent intent, int startId)
    {
        alarm.setAlarm(this);
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
