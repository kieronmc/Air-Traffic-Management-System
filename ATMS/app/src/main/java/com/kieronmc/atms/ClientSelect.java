package com.kieronmc.atms;
import com.kieronmc.atms.clientOne.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClientSelect extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_select);

        Button two = (Button) findViewById(R.id.client1connect);
        if(ClientLock.progressStripCheck() == false){
            two.setOnClickListener(this);
        } else {
            two.setEnabled(false);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.client1connect:
                Intent startClientOneAct = new Intent(ClientSelect.this, Client1Start.class);
                startActivity(startClientOneAct);
                break;



            default:
                break;
        }
    }
}
