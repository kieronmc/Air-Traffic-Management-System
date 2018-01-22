package com.kieronmc.atms.clientOne;

import com.kieronmc.atms.ClientLock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kieronmc.atms.R;

public class Client1Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client1_start);

        ClientLock.progressStripLock();
    }
}
