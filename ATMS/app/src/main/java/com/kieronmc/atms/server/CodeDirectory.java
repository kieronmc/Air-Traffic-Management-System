package com.kieronmc.atms.server;



public class CodeDirectory {

    public static String code(String code) {

        int codeNumber = Integer.parseInt(code);
        String outText;
        switch(codeNumber) {
            case 1001:
                outText = "Print Code: 1001";
                break;
            case 1002:
                outText = "Print Code: 1002";
                break;

            default: outText = "Incorrect code value entered!";
            break;
        }

        return(outText);
    }
}
