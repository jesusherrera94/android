package com.example.jesusherrera.botondestruirmundo;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

public class Boton2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton2);
        Toast toast = Toast.makeText(this, "Has ordenado destruir el mundo ¡CON EXITO!", Toast.LENGTH_LONG);
        toast.show();
        final VideoView mvideo = (VideoView) findViewById(R.id.videoView);

        new Thread(new Runnable() {
            public void run() {

                //de forma alternativa si queremos un streaming usar
                mvideo.setVideoURI(Uri.parse("android.resource://com.example.jesusherrera.botondestruirmundo/" + R.raw.destruirmundo));

                mvideo.requestFocus();
                mvideo.start();
                vibrar();

            }
        }).start();
    }


    public void vibrar() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(31800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 1 seconds
                v.vibrate(11000);
            }
        }).start();

    }


}