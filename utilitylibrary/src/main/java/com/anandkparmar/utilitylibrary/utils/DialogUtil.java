package com.anandkparmar.utilitylibrary.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;

import com.anandkparmar.utilitylibrary.R;

/**
 * Created by anandparmar on 10/11/17.
 */

public class DialogUtil {

    public static void showAlertDialog(Context context, String title, String message, boolean isCancelable,
                                  String positiveButtonText, DialogInterface.OnClickListener positiveButtonOnClickListener) {
        showAlertDialog(context, title, message, isCancelable,
                positiveButtonText, positiveButtonOnClickListener,
                null, null,
                null, null);
    }

    public static void showAlertDialog(Context context, String title, String message, boolean isCancelable,
                                  String positiveButtonText, DialogInterface.OnClickListener positiveButtonOnClickListener,
                                  String negativeButtonText, DialogInterface.OnClickListener negativeButtonOnClickListener) {
        showAlertDialog(context, title, message, isCancelable,
                positiveButtonText, positiveButtonOnClickListener,
                negativeButtonText, negativeButtonOnClickListener,
                null, null);
    }

    public static void showAlertDialog(Context context, String title, String message, boolean isCancelable,
                                  String positiveButtonText, DialogInterface.OnClickListener positiveButtonOnClickListener,
                                  String negativeButtonText, DialogInterface.OnClickListener negativeButtonOnClickListener,
                                  String neutralButtonText, DialogInterface.OnClickListener neutralButtonOnClickListener) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(isCancelable);
        builder.setMessage(message);

        if (!TextUtils.isEmpty(title)) {
            builder.setTitle(title);
        }

        if (!TextUtils.isEmpty(positiveButtonText)) {
            builder.setPositiveButton(positiveButtonText, positiveButtonOnClickListener);
        }

        if (!TextUtils.isEmpty(negativeButtonText)) {
            builder.setNegativeButton(negativeButtonText, negativeButtonOnClickListener);
        }

        if (!TextUtils.isEmpty(neutralButtonText)) {
            builder.setNeutralButton(neutralButtonText, neutralButtonOnClickListener);
        }

        AlertDialog dialog = builder.create();
        dialog.show();

        dialog.getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE).setTextColor(context.getResources().getColor(R.color.color_primary));
        dialog.getButton(android.support.v7.app.AlertDialog.BUTTON_NEGATIVE).setTextColor(context.getResources().getColor(R.color.color_primary));
        dialog.getButton(android.support.v7.app.AlertDialog.BUTTON_NEUTRAL).setTextColor(context.getResources().getColor(R.color.color_primary));
    }

    public static void showInfoDialogWithOkButton(Context context, String title, String message, boolean isCancelable) {
        showAlertDialog(context, title, message, isCancelable,
                "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                },
                null, null,
                null, null);
    }
}
