package com.enjamamulhoque.servicesfeature;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button startBtn, stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.start_service_btn);
        stopBtn = findViewById(R.id.stop_service_btn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this, MyService.class)); // Use MainActivity.this
                Toast.makeText(MainActivity.this, "Service started.", Toast.LENGTH_SHORT).show();
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this, MyService.class)); // Use MainActivity.this
                Toast.makeText(MainActivity.this, "Service stopped.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
