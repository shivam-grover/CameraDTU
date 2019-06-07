package com.example.camera;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intentAlarm = new Intent(this, MainActivity.class);

        // create the object
        AlarmManager am =( AlarmManager)getSystemService(Context.ALARM_SERVICE);
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, intentAlarm, 0);
        am.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 1000  * 10, pi); // Millisec
        Toast.makeText(this, "Alarm Scheduled for Tommrrow", Toast.LENGTH_LONG).show();
//        Intent intentAlarm = new Intent(this, MainActivity.class);

    }
}
