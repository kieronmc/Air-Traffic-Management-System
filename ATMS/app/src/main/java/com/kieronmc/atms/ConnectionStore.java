package com.kieronmc.atms;

import android.widget.EditText;

public class ConnectionStore {
    public static String address;
    public static String port;

    public static void setConnection(String ad, int prt) {
        address = ad;
        port = String.valueOf(port);
    }

    public String[] connecton(){
        String array[] = new String[1];
        array[0] = address;
        array[1] = port;
        return array;
    }
}
