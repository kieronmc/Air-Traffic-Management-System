package com.kieronmc.atms.clientOne;


import java.io.Serializable;

public class Output implements Serializable{    // Serializable because required for object data to be stored during and after transmission over network.

    String messg;
    int code;

    public Output(String entryMessg, int entryCode) {
        this.messg = entryMessg;
        this.code = entryCode;
    }


}
