package com.paybright.demo;


/*
 * Created by Manpreet Singh on 20/09/2018.
 */


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.view.View;
import android.widget.EditText;

import com.paybright.sdk.PBConfig;
import com.paybright.sdk.PBCustomer;
import com.paybright.sdk.PBCustomerBilling;
import com.paybright.sdk.PBCustomerShipping;
import com.paybright.sdk.PBInstance;
import com.paybright.sdk.PBProduct;
import com.paybright.sdk.PBViewController;
import com.paybright.sdk.PBWebViewDelegate;

public class MainActivity extends AppCompatActivity implements PBWebViewDelegate, View.OnClickListener {

    private EditText etPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        AppDelegate.application();

        etPrice = findViewById(R.id.etPrice);

        findViewById(R.id.tvBright).setOnClickListener(this);

        findViewById(R.id.tvDevMode).setOnClickListener(this);
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

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.tvBright:

                proceedPayment();

                new PBViewController(MainActivity.this, MainActivity.this);

                break;

            case R.id.tvDevMode:

                startActivity(new Intent(this, DevModeActivity.class));

                break;
        }
    }

    private void proceedPayment() {

        PBCustomer customerObj = new PBCustomer(
                "cs@paybright.com",
                "James",
                "Testhetfield",
                null);

        PBCustomerBilling customerBillingObj = new PBCustomerBilling(
                "270 Rue Olier",
                null,
                "Chicoutimi",
                null,
                "CA",
                "+1-613-987-6543",
                "QC",
                "G7G 4J3");

        PBCustomerShipping customerShippingObj = new PBCustomerShipping(
                "270 Rue Olier",
                null,
                "Chicoutimi",
                "Shopify",
                "CA",
                "James",
                "Testhetfield",
                "+1-613-987-6543",
                "QC",
                "G7G 4J3");

        PBProduct productObj = new PBProduct(Double.valueOf(etPrice.getText().toString()),
                "CAD",
                "PaymentGatewayTesting - #4682855809085",
                "#4682855809085",
                null,
                "sdk",
                "4682855809085",
                "CA",
                "PaymentGatewayTesting",
                "https://checkout.shopify.com/services/ping/notify_integration/paybright/19629019",
                "https://paymentgatewaytesting.myshopify.com/19629019/checkouts/84044f7a52ff18a84dd1f2b5cd46b387?key=0c4978718a87a00e5ac1456b577b5695",
                "https://paymentgatewaytesting.myshopify.com/19629019/checkouts/84044f7a52ff18a84dd1f2b5cd46b387/offsite_gateway_callback");

        PBConfig.getInstance().instanceObj = new PBInstance(customerObj,
                customerBillingObj,
                customerShippingObj,
                productObj);
    }
}


