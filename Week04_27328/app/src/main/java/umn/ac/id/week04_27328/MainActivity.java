package umn.ac.id.week04_27328;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    Button btnPindah, btnKirim, btnBrowse, btnFragment;
    EditText etIsian, etUrl;
    TextView tvJawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Main Activity Intent");

        btnPindah = findViewById(R.id.btnPindah);
        btnKirim = findViewById(R.id.btnKirim);
        btnBrowse = findViewById(R.id.btnBrowse);
        etIsian = findViewById(R.id.isian);
        etUrl = findViewById(R.id.website);
        tvJawaban = findViewById(R.id.jawaban);
        btnFragment = findViewById(R.id.btnFragment);

        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlText = etUrl.getText().toString();
                if(urlText.isEmpty()){
                    urlText = "http://umn.ac.id/";
                }
                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));
                if(browseIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(browseIntent);
                }
            }
        });

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDua = new Intent(MainActivity.this, SecondActivity.class);
                String isian = etIsian.getText().toString();
                intentDua.putExtra("PesanDariMain", isian);
                startActivityForResult(intentDua, 1);
            }
        });

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                String jawaban = data.getStringExtra("Jawaban");
                tvJawaban.setText(jawaban);
            }
        }
    }
}