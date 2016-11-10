package com.example.niklas.iboapp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread myThread = new Thread (){
            @Override

            public void run(){
                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }catch(InterruptedException e){
                    e.printStackTrace();


                }
            }
        };
        myThread.start();
    }




}
