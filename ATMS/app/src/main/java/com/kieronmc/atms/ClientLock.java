package com.kieronmc.atms;



public class ClientLock {

    private static boolean progressStrip = false;
    private boolean airMap = false;
    private boolean radar = false;
    private boolean actionBoard = false;
    private boolean stats = false;


    // Progress Strip (Client 1)
    public static boolean progressStripCheck() {
        if (progressStrip == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void progressStripLock() {
        progressStrip = true;
    }


    public boolean airMapCheck() {
        if (airMap == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean radarCheck() {
        if (radar == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean actionBoardCheck() {
        if (actionBoard == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean statsCheck() {
        if (stats == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
