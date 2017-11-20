package com.anandkparmar.utilitylibrary.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.anandkparmar.utilitylibrary.R;
import com.gleezr.slink.SlinkManager;

import javax.inject.Inject;

import static android.R.attr.name;

/**
 * Created by anandparmar on 11/10/17.
 */

public class SharedPreferencesUtils {

    // Constant Keys
    private static final String DEMO_USERNAME = "USERNAME";

    public static SharedPreferences sharedPreferences;

    private static SharedPreferences getSharedPreferences(Context context) {
        if(sharedPreferences == null) {
            sharedPreferences = SlinkManager.getSlink(context, context.getResources().getString(R.string.app_name));

        }
        
        return sharedPreferences;
    }

    public static void setDemoUsername(Context context, String name){
        getSharedPreferences(context).edit().putString(DEMO_USERNAME, name).apply();
    }

    public static String getDemoUsername(Context context){
        return getSharedPreferences(context).getString(DEMO_USERNAME, "");
    }
}
