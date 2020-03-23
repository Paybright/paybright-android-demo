package com.paybright.demo;


/*
 * Created by Manpreet Singh on 20/09/2018.
 */


import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.view.View;

import com.paybright.sdk.PBConfig;
import com.paybright.sdk.PBCustomer;
import com.paybright.sdk.PBCustomerBilling;
import com.paybright.sdk.PBCustomerShipping;
import com.paybright.sdk.PBInstance;
import com.paybright.sdk.PBProduct;
import com.paybright.sdk.PBViewController;
import com.paybright.sdk.PBWebViewDelegate;

public class DevModeActivity extends AppCompatActivity implements View.OnClickListener, PBWebViewDelegate {

    private int btnTapResponse = 1, btnTapEnvironment = 1, btnTapAuth = 1;

    private AppCompatButton btAutoCap, btAuth, btCompleted, btFailed, btTest, btLive;

    private AppCompatEditText etApiToken, etAccountID, etPPrice, etPCurrency, etPDesc, etPInvoice, etPPlanID, etPPlateform,
            etPReference, etPCountry, etPShopName, etPUrlCallback, etPUrlCancel, etPComplete,
            etCSAddress1, etCSAddress2, etCSCity, etCSCompany, etCSCountry, etCSFirstName,
            etCSLastName, etCSPhone, etCSState, etCSZip, etCEmail, etCFirstName, etCLastName,
            etCPhone, etCBAddress1, etCBAddress2, etCBCity, etCBCompany, etCBCountry, etCBPhone, etCBState, etCBZip;

    Resources rResources;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dev_mode);

        rResources = getResources();

        PBConfig.getInstance().environment = PBConfig.PBEnvironment.Sandbox;

        initIds();
    }

    private void initIds() {

        etAccountID = findViewById(R.id.etAccountID);

        etApiToken = findViewById(R.id.etApiToken);

        etPPrice = findViewById(R.id.etPPrice);

        etPCurrency = findViewById(R.id.etPCurrency);

        etPDesc = findViewById(R.id.etPDesc);

        etPInvoice = findViewById(R.id.etPInvoice);

        etPPlanID = findViewById(R.id.etPPlanID);

        etPPlateform = findViewById(R.id.etPPlateform);

        etPReference = findViewById(R.id.etPReference);

        etPCountry = findViewById(R.id.etPCountry);

        etPShopName = findViewById(R.id.etPShopName);

        etPUrlCallback = findViewById(R.id.etPUrlCallback);

        etPUrlCancel = findViewById(R.id.etPUrlCancel);

        etPComplete = findViewById(R.id.etPComplete);


        etCSAddress1 = findViewById(R.id.etCSAddress1);

        etCSAddress2 = findViewById(R.id.etCSAddress2);

        etCSCity = findViewById(R.id.etCSCity);

        etCSCompany = findViewById(R.id.etCSCompany);

        etCSCountry = findViewById(R.id.etCSCountry);

        etCSFirstName = findViewById(R.id.etCSFirstName);

        etCSLastName = findViewById(R.id.etCSLastName);

        etCSPhone = findViewById(R.id.etCSPhone);

        etCSState = findViewById(R.id.etCSState);

        etCSZip = findViewById(R.id.etCSZip);


        etCEmail = findViewById(R.id.etCEmail);

        etCFirstName = findViewById(R.id.etCFirstName);

        etCLastName = findViewById(R.id.etCLastName);

        etCPhone = findViewById(R.id.etCPhone);


        etCBAddress1 = findViewById(R.id.etCBAddress1);

        etCBAddress2 = findViewById(R.id.etCBAddress2);

        etCBCity = findViewById(R.id.etCBCity);

        etCBCompany = findViewById(R.id.etCBCompany);

        etCBCountry = findViewById(R.id.etCBCountry);

        etCBPhone = findViewById(R.id.etCBPhone);

        etCBState = findViewById(R.id.etCBState);

        etCBZip = findViewById(R.id.etCBZip);


        btTest = findViewById(R.id.btTest);

        btTest.setOnClickListener(this);

        btLive = findViewById(R.id.btLive);

        btLive.setOnClickListener(this);

        btAutoCap = findViewById(R.id.btAutoCap);

        btAutoCap.setOnClickListener(this);

        btAuth = findViewById(R.id.btAuth);

        btAuth.setOnClickListener(this);

        btCompleted = findViewById(R.id.btCompleted);

        btCompleted.setOnClickListener(this);

        btFailed = findViewById(R.id.btFailed);

        btFailed.setOnClickListener(this);

        findViewById(R.id.btLaunchPB).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btAutoCap:

                if (btnTapAuth == 1)

                    return;

                etAccountID.setText("NjOcXFC8cvTPtAwv3TCGFvSamx74HPvTgm1s46CcGENMmbWFUa");

                etApiToken.setText("9O49jqV5mW5wWvctuk3mjs9WW5A4VgW5wrtRSvaYSHfahaYOBX");

                btAutoCap.setBackgroundResource(R.drawable.bg_selected_left);

                btAutoCap.setTextColor(Color.WHITE);

                btAuth.setBackgroundResource(R.drawable.bg_un_selected_left);

                btAuth.setTextColor(rResources.getColor(R.color.color_blue));

                btnTapAuth = 1;

                break;

            case R.id.btAuth:

                if (btnTapAuth == 2)

                    return;

                etAccountID.setText("aGGGm7d7tYTnMvrZQHfDJNFsRqq63FJYR2tkqk7bSU3Ad1MjbQ");
                etApiToken.setText("nvaEg7tHCdOcJ7XK8Hdsm7MJY3SWZtksZtrv4FFhCRG3cduddj");

                btAuth.setBackgroundResource(R.drawable.bg_selected_right);
                btAuth.setTextColor(Color.WHITE);

                btAutoCap.setBackgroundResource(R.drawable.bg_un_selected_right);
                btAutoCap.setTextColor(rResources.getColor(R.color.color_blue));

                btnTapAuth = 2;

                break;

            case R.id.btCompleted:

                if (btnTapResponse == 1)

                    return;

                etCFirstName.setText("James");

                etCLastName.setText("Testhetfield");

                etCBAddress1.setText("270 Rue Olier");

                etCBCity.setText("Chicoutimi");

                etCBState.setText("QC");

                etCBZip.setText("G7G 4J3");

                etCSAddress1.setText("270 Rue Olier");

                etCSCity.setText("Chicoutimi");

                etCSFirstName.setText("James");

                etCSLastName.setText("Testhetfield");

                etCSState.setText("QC");

                etCSZip.setText("G7G 4J3");

                btCompleted.setBackgroundResource(R.drawable.bg_selected_left);
                btCompleted.setTextColor(Color.WHITE);

                btFailed.setBackgroundResource(R.drawable.bg_un_selected_left);
                btFailed.setTextColor(rResources.getColor(R.color.color_blue));

                btnTapResponse = 1;

                break;

            case R.id.btFailed:

                if (btnTapResponse == 2)

                    return;

                etCFirstName.setText("Billy");

                etCLastName.setText("Bucket");

                etCBAddress1.setText("1531 Lee Blvd");

                etCBCity.setText("Winnipeg");

                etCBState.setText("MB");

                etCBZip.setText("R3Y 1S3");

                etCSAddress1.setText("1531 Lee Blvd");

                etCSCity.setText("Winnipeg");

                etCSFirstName.setText("Billy");

                etCSLastName.setText("Bucket");

                etCSState.setText("MB");

                etCSZip.setText("R3Y 1S3");

                btFailed.setBackgroundResource(R.drawable.bg_selected_right);
                btFailed.setTextColor(Color.WHITE);

                btCompleted.setBackgroundResource(R.drawable.bg_un_selected_right);
                btCompleted.setTextColor(rResources.getColor(R.color.color_blue));

                btnTapResponse = 2;

                break;

            case R.id.btTest:

                if (btnTapEnvironment == 1)

                    return;

                btnTapEnvironment = 1;

                PBConfig.getInstance().environment = PBConfig.PBEnvironment.Sandbox;

                btTest.setBackgroundResource(R.drawable.bg_selected_left);
                btTest.setTextColor(Color.WHITE);

                btLive.setBackgroundResource(R.drawable.bg_un_selected_left);
                btLive.setTextColor(rResources.getColor(R.color.color_blue));

                break;

            case R.id.btLive:

                if (btnTapEnvironment == 2)

                    return;

                btnTapEnvironment = 2;

                PBConfig.getInstance().environment = PBConfig.PBEnvironment.Production;

                btLive.setBackgroundResource(R.drawable.bg_selected_right);
                btLive.setTextColor(Color.WHITE);

                btTest.setBackgroundResource(R.drawable.bg_un_selected_right);
                btTest.setTextColor(rResources.getColor(R.color.color_blue));

                break;

            case R.id.btLaunchPB:

                proceedPayment();

                break;
        }
    }

    private void proceedPayment() {

        PBCustomer customerObj = new PBCustomer(
                etCEmail.getText().toString(),
                etCFirstName.getText().toString(),
                etCLastName.getText().toString(),
                etCPhone.getText().toString().isEmpty() ? null : etCPhone.getText().toString());

        PBCustomerBilling customerBillingObj = new PBCustomerBilling(
                etCBAddress1.getText().toString(),
                etCBAddress2.getText().toString().isEmpty() ? null : etCBAddress2.getText().toString(),
                etCBCity.getText().toString(),
                etCBCompany.getText().toString().isEmpty() ? null : etCBCompany.getText().toString(),
                etCBCountry.getText().toString(),
                etCBPhone.getText().toString(),
                etCBState.getText().toString(),
                etCBZip.getText().toString());

        PBCustomerShipping customerShippingObj = new PBCustomerShipping(
                etCSAddress1.getText().toString(),
                etCSAddress2.getText().toString().isEmpty() ? null : etCSAddress2.getText().toString(),
                etCSCity.getText().toString(),
                etCSCompany.getText().toString(),
                etCSCountry.getText().toString(),
                etCSFirstName.getText().toString(),
                etCSLastName.getText().toString(),
                etCSPhone.getText().toString(),
                etCSState.getText().toString(),
                etCSZip.getText().toString());

        PBProduct productObj = new PBProduct(
                Double.valueOf(etPPrice.getText().toString()),
                etPCurrency.getText().toString(),
                etPDesc.getText().toString(),
                etPInvoice.getText().toString(),
                etPPlanID.getText().toString().isEmpty() ? null : etPPlanID.getText().toString(),
                etPPlateform.getText().toString(),
                etPReference.getText().toString(),
                etPCountry.getText().toString(),
                etPShopName.getText().toString(),
                etPUrlCallback.getText().toString(),
                etPUrlCancel.getText().toString(),
                etPComplete.getText().toString());

        PBConfig.getInstance().apiToken = etApiToken.getText().toString();

        PBConfig.getInstance().accountID = etAccountID.getText().toString();

        PBConfig.getInstance().instanceObj = new PBInstance(customerObj,
                customerBillingObj,
                customerShippingObj,
                productObj);

        new PBViewController(this, DevModeActivity.this);
    }

    @Override
    public void userDidCancel() {

        GeneralHelper.showAlert(this, "Cancelled",
                "User cancelled the transaction");
    }

    @Override
    public void transactionComplete(boolean success, String params) {

        GeneralHelper.showAlert(this, success ? "Success" : "Failed", params);
    }
}
