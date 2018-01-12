package com.kieronmc.atms.server.codes;


public class code1001 {

    public static String main(int a,String b) {

        String messAdd = "";

        messAdd += "Message Sent Code: " + a + "\n"
                + "Msg from client: " + b + "\n"
                + "(Action made on code 1001)\n";

        return(messAdd);
    }
}
