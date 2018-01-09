package com.kieronmc.atms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.serverStart);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.clientOneStart);
        two.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.serverStart:
                Intent startServerAct = new Intent(MainActivity.this, ServerStart.class);
                startActivity(startServerAct);
                break;

            case R.id.clientOneStart:
                Intent startClientOneAct = new Intent(MainActivity.this, client1start.class);
                startActivity(startClientOneAct);
                break;

            default:
                break;
        }
    }


}




    /*Button startServerBtn;
    Button startClientOneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startServerBtn = (Button) findViewById(R.id.serverStart);
        startServerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent startServerAct = new Intent(MainActivity.this, ServerStart.class);
                startActivity(startServerAct);
            }
        });

        startClientOneBtn = (Button) findViewById(R.id.serverStart);
        startClientOneBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg1) {
                Intent startClientOneAct = new Intent(MainActivity.this, client1start.class);
                startActivity(startClientOneAct);
            }
        });*/


    //}


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/



