package com.example.pc2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar p;
    Handler h= new Handler();
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p=(ProgressBar) findViewById(R.id.progressBar);
        Run();
    }
    public void Run(){
        Thread hilo=new Thread(new Runnable() {
            @Override
            public void run() {
                while(i<=50){
                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            p.setProgress(i);
                        }
                    });
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if(i==50){
                        Intent sig = new Intent(MainActivity.this, lista.class);
                        startActivity(sig);
                    }
                    i++;
                }
            }
        });
        hilo.start();

    }
}