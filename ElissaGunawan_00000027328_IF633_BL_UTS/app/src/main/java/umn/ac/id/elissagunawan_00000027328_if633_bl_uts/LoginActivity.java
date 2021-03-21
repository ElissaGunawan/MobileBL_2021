package umn.ac.id.elissagunawan_00000027328_if633_bl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText user, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("Halaman Login");

        login = findViewById(R.id.login);
        user = findViewById(R.id.user);
        password = findViewById(R.id.pass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = user.getText().toString();
                String passwordKey = password.getText().toString();
                if (usernameKey.equals("uasmobile") && passwordKey.equals("uasmobilegenap")) {
                    Intent intent =  new Intent(LoginActivity.this, MusicActivity.class);
                    startActivity(intent);
                } else {
                    String toastMessage = "Username or Password wrong input";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}