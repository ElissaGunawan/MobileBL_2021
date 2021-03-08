package umn.ac.id.week06_27328;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import umn.ac.id.week06_27328.animasiDrawable.ADrawableActivity;
import umn.ac.id.week06_27328.animasiIlmuFisika.AIlmuFisikaActivity;
import umn.ac.id.week06_27328.animasiProperty.APropertyActivity;

public class MainActivity extends AppCompatActivity {
    Button btnProperty, btnDrawable, btnIlmuFisika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProperty = findViewById(R.id.btnProperty);
        btnDrawable = findViewById(R.id.btnDrawable);
        btnIlmuFisika = findViewById(R.id.btnIlmuFisika);

        btnProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, APropertyActivity.class));
            }
        });
        btnDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ADrawableActivity.class));
            }
        });
        btnIlmuFisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AIlmuFisikaActivity.class));
            }
        });
    }

}