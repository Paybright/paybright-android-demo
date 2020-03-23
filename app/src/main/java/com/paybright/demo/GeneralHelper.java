package com.paybright.demo;


/*
 * Created by Manpreet Singh on 22/09/2018.
 */


import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

class GeneralHelper {

    static void showAlert(Context cContext, String title, String msg) {

        final AlertDialog.Builder alertB = new AlertDialog.Builder(cContext);

        alertB.setCancelable(false);

        alertB.setTitle(title);

        alertB.setMessage(msg);

        alertB.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                dialog.dismiss();
            }
        });

        alertB.show();
    }
}
