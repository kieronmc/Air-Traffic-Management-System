package com.kieronmc.atms.server;

import com.kieronmc.atms.server.codes.*;

public class CodeDirectory {

    public static String code(String code) {

        String[] separateCode = code.split(":");
        String codeNum = separateCode[0];
        String messageSent = separateCode[1];

        int codeNumber = Integer.parseInt(codeNum);
        String result;
        switch(codeNumber) {
            case 1001:
                result = code1001.main(codeNumber,messageSent);
                break;
            case 1002:
                result = "Print Code: 1002";
                break;

            default: result = "Incorrect code value entered. No action was made.";
            break;
        }
        return (result);
    }
}
