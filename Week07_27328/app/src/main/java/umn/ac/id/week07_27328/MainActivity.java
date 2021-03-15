package umn.ac.id.week07_27328;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import GaleriVideo.GaleriVideoActivity;
import Kamera.KameraActivity;

public class MainActivity extends AppCompatActivity {
    Button Kamera, GaleriVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Kamera = findViewById(R.id.Kamera);
        GaleriVideo = findViewById(R.id.GaleriVideo);

        Kamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KameraActivity.class);
                startActivity(intent);
            }
        });
        GaleriVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GaleriVideoActivity.class);
                startActivity(intent);
            }
        });
    }
}