package com.anandkparmar.utilitylibrary.utils;

import android.content.Context;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.anandkparmar.utilitylibrary.R;

/**
 * Created by anandparmar on 10/11/17.
 */

public class ToastUtils {

    public static void showDefaultToast(Context context, String message){
        showDefaultShortToast(context, message);
    }

    public static void showDefaultShortToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }


    public static void showDefaultLongToast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void showCustomToastOnTop(Context context, String message){
        showCustomShortToastOnTop(context, message);
    }

    public static void showCustomShortToastOnTop(Context context, String message){
        customToast(context, message, Toast.LENGTH_SHORT, Gravity.TOP | Gravity.FILL_HORIZONTAL);
    }

    public static void showCustomLongToastOnTop(Context context, String message){
        customToast(context, message, Toast.LENGTH_LONG, Gravity.TOP | Gravity.FILL_HORIZONTAL);
    }

    public static void showCustomToastOnBottom(Context context, String message){
        showCustomShortToastOnBottom(context, message);
    }

    public static void showCustomShortToastOnBottom(Context context, String message){
        customToast(context, message, Toast.LENGTH_SHORT, Gravity.BOTTOM | Gravity.FILL_HORIZONTAL);
    }

    public static void showCustomLongToastOnBottom(Context context, String message){
        customToast(context, message, Toast.LENGTH_LONG, Gravity.BOTTOM | Gravity.FILL_HORIZONTAL);
    }

    public static void showCustomToastInCenter(Context context, String message){
        showCustomShortToastInCenter(context, message);
    }

    public static void showCustomShortToastInCenter(Context context, String message){
        customToast(context, message, Toast.LENGTH_SHORT, Gravity.CENTER | Gravity.CENTER_HORIZONTAL);
    }

    public static void showCustomLongToastInCenter(Context context, String message){
        customToast(context, message, Toast.LENGTH_LONG, Gravity.CENTER | Gravity.CENTER_HORIZONTAL);
    }

    private static void customToast(Context context, String message, int messageLength, int gravity){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.toast_layout, null);
        TextView text = (TextView) layout.findViewById(R.id.toast_message_text_view);
        text.setText(Html.fromHtml(message));

        Toast toast = new Toast(context.getApplicationContext());
        toast.setGravity(gravity, 0, 0);
        toast.setDuration(messageLength);
        toast.setView(layout);
        toast.show();
    }
}
