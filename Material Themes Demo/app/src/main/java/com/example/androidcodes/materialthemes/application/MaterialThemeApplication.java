package com.example.androidcodes.materialthemes.application;

import android.app.Application;

import com.example.androidcodes.materialthemes.log.LogUtils;

import timber.log.Timber;

/**
 * @author Steven Byle
 */
public class MaterialThemeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize logging first to log all operations
        LogUtils.initLoggingUtilities();
        Timber.v(LogUtils.METHOD_ONLY);
    }
}
