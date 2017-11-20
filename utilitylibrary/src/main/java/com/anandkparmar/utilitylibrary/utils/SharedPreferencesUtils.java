package com.anandkparmar.utilitylibrary.utils;

import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by anandparmar on 11/10/17.
 */

public class SharedPreferencesUtils {

    @Inject
    private static SharedPreferences sharedPreferences;


    // Constant Keys
    private static final String DEMO_USERNAME = "USERNAME";

    public static void setDemoUsername(String name){
        sharedPreferences.edit().putString(DEMO_USERNAME, name).apply();
    }

    public static String getDemoUsername(){
        return sharedPreferences.getString(DEMO_USERNAME, "");
    }
}
