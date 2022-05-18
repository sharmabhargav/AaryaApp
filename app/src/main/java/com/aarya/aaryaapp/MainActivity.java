package com.aarya.aaryaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    //--newcode
    ImageView sirenbtn;
    MediaPlayer mediaPlayer;
    //--

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //--new code for siren
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.siren);
        sirenbtn=(ImageView) findViewById(R.id.sirenbtn);
        sirenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()){
                    sirenbtn.setImageResource(R.drawable.siren);
                    Toast.makeText(MainActivity.this, "Siren stopped", Toast.LENGTH_SHORT).show();
                    mediaPlayer.stop();
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.siren);
                }
                else{
                    sirenbtn.setBackgroundResource(R.drawable.siren);
                    Toast.makeText(MainActivity.this, "Playing siren", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();
                }
            }
        });

        //-----

//        Bundle extras = getIntent().getExtras();
//        String V1 = extras.getString(Intent.EXTRA_TEXT);
//        Log.d("NumberMainActivity", V1);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = getIntent().getExtras();
        String V1 = extras.getString(Intent.EXTRA_TEXT);
        Log.d("NumberMainActivity", V1);
    }

    //    public void myProfile(View v){
//        Intent i = new Intent(getApplicationContext(), MyProfile.class);
//        startActivity(i);
//    }

    public void addRelative(View v){
        Intent i = new Intent(getApplicationContext(), AddRelative.class);
        startActivity(i);
    }
    public void helplineNumbers(View v){
        Intent i = new Intent(getApplicationContext(), helplineCall.class);
        startActivity(i);
    }
//    public void triggers(View v){
//        Intent i = new Intent(getApplicationContext(), SirenActivity.class);
//        startActivity(i);
//    }
    public void crimemap(View v){
        Intent i = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(i);
    }
    public void Defguide(View v){
        Intent i = new Intent(getApplicationContext(), DefenseGuide.class);
        startActivity(i);
    }
    public void LogOut(View v){
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
        Toast.makeText(this, "Logged Out Successfully", Toast.LENGTH_SHORT).show();
    }


//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//
//        int action, keycode;
//
//        action = event.getAction();
//        keycode = event.getKeyCode();
//
//        switch (keycode)
//        {
//            case KeyEvent.KEYCODE_VOLUME_UP:
//                {
//                if(KeyEvent.ACTION_UP == action){
//                    count++;
//                    String S1 = String.valueOf(count);
//                    Log.d("upButton", S1);
//                }
//            }
//            case KeyEvent.KEYCODE_VOLUME_DOWN:
//                if(KeyEvent.ACTION_DOWN == action){
//                    count = 0;
//                    String S2 = String.valueOf(count);
//                    Log.d("downButton", S2);
//                }
//        }
//        return super.dispatchKeyEvent(event);
//    }

}
