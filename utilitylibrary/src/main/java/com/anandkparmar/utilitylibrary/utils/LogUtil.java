package com.anandkparmar.utilitylibrary.utils;

import android.util.Log;

import static android.R.id.message;

/**
 * Created by anandparmar on 10/11/17.
 */

public class LogUtil {

    private static final String TAG = "AndroidBaseProject";

    public static void verbose(String message){
        Log.v(TAG, message);
    }

    public static void verbose(String tag, String message){
        Log.v(tag, message);
    }

    public static void verbose(String message, Throwable throwable){
        Log.v(TAG, message, throwable);
    }

    public static void verbose(String tag, String message, Throwable throwable){
        Log.v(tag, message, throwable);
    }


    public static void info(String message){
        Log.i(TAG, message);
    }

    public static void info(String tag, String message){
        Log.i(tag, message);
    }

    public static void info(String message, Throwable throwable){
        Log.i(TAG, message, throwable);
    }

    public static void info(String tag, String message, Throwable throwable){
        Log.i(tag, message, throwable);
    }


    public static void debug(String message){
        Log.d(TAG, message);
    }

    public static void debug(String tag, String message){
        Log.d(tag, message);
    }

    public static void debug(String message, Throwable throwable){
        Log.d(TAG, message, throwable);
    }

    public static void debug(String tag, String message, Throwable throwable){
        Log.d(tag, message, throwable);
    }


    public static void warn(String message){
        Log.w(TAG, message);
    }

    public static void warn(String tag, String message){
        Log.w(tag, message);
    }

    public static void warn(String message, Throwable throwable){
        Log.w(TAG, message, throwable);
    }

    public static void warn(String tag, String message, Throwable throwable){
        Log.w(tag, message, throwable);
    }


    public static void error(String message){
        Log.e(TAG, message);
    }

    public static void error(String tag, String message){
        Log.e(tag, message);
    }

    public static void error(String message, Throwable throwable){
        Log.e(TAG, message, throwable);
    }

    public static void error(String tag, String message, Throwable throwable){
        Log.e(tag, message, throwable);
    }
}
