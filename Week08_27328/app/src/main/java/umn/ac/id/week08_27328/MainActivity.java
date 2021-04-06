package umn.ac.id.week08_27328;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnText, btnSaved;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnText = findViewById(R.id.btnText);
        btnSaved = findViewById(R.id.btnSaved);

        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextEditorActivity.class);
                startActivity(intent);
            }
        });

        btnSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SavedInstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}