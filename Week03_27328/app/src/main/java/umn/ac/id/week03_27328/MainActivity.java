package umn.ac.id.week03_27328;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabAdd;
    RecyclerView rvList;
    Adapter adapter;

    List<String> kataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 28; i++){
            kataList.add("Kata " + (i + 1));
        }

        fabAdd = findViewById(R.id.fabAdd);
        rvList = findViewById(R.id.recycleview);

        adapter = new Adapter(MainActivity.this, kataList);
        rvList.setAdapter(adapter);
        rvList.setLayoutManager(new LinearLayoutManager(this));

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kataList.add("Kata " + (kataList.size() + 1));
                adapter.notifyDataSetChanged();
                Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}