package com.example.mymealpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Button mButtonStart;
    private boolean startTimer;
    private CountDownTimer foodTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonStart= (Button)findViewById(R.id.startButton);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);

        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonStart.setText("STOP");

                new CountDownTimer(300000, 10000) {

                    public void onTick(long millisUntilFinished) {

                        mp.start();


                        //here you can have your logic to set text to edittext
                    }

                    public void onFinish() {

                    }

                }.start();

            }


        });

    }
}