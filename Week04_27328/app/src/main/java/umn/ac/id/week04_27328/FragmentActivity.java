package umn.ac.id.week04_27328;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        this.setTitle("Fragment");

        TopFragment topFragment = new TopFragment();
        BottomFragment bottomFragment = new BottomFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.frmTop, topFragment);
        transaction.replace(R.id.frmBottom, bottomFragment);

        transaction.commit();
    }
}