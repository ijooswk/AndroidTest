package com.example.parksehun.androidtest;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by parksehun on 2017. 4. 6..
 */

public class serviceTest extends IntentService {
    long seconds;
    public serviceTest(){
        super(serviceTest.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        seconds= intent.getExtras().getLong("seconds");
        long millis = seconds*1000;
        try {
            Thread.sleep(millis);
        } catch (Exception e){

        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, String.format("Slept %d seconds", seconds),Toast.LENGTH_LONG).show();
    }
}
