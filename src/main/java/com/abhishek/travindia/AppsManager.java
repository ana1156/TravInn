package com.abhishek.travindia;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by abhishek on 12-07-2017.
 */

public class AppsManager extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
