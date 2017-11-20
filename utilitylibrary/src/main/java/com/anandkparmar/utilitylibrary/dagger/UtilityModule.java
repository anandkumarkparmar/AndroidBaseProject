package com.anandkparmar.utilitylibrary.dagger;

import android.content.Context;
import android.content.SharedPreferences;

import com.anandkparmar.utilitylibrary.R;
import com.gleezr.slink.SlinkManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anandparmar on 11/10/17.
 */

@Module
public class UtilityModule {

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(Context context){
        return SlinkManager.getSlink(context, context.getResources().getString(R.string.app_name));
    }
}
