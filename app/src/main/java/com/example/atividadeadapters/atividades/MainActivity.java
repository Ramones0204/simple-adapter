package com.example.atividadeadapters.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atividadeadapters.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void simpleAdapter(View view) {
        startActivity(new Intent(this,SimpleAdapter.class));
    }
}
