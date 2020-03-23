package com.paybright.demo;


/*
 * Created by Manpreet Singh on 20/09/2018.
 */


import com.paybright.sdk.PBConfig;

class AppDelegate {

    static void application() {

        PBConfig.getInstance().initialize(PBConfig.PBEnvironment.Production,
                "NjOcXFC8cvTPtAwv3TCGFvSamx74HPvTgm1s46CcGENMmbWFUa",
                "9O49jqV5mW5wWvctuk3mjs9WW5A4VgW5wrtRSvaYSHfahaYOBX");
    }
}
