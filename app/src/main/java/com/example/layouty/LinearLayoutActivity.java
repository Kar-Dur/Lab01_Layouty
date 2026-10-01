package com.example.layouty;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        findViewById(R.id.btnLogin).setOnClickListener(v ->
                Toast.makeText(this, "Kliknięto: Zaloguj", Toast.LENGTH_SHORT).show());

        findViewById(R.id.btnCancel).setOnClickListener(v -> finish());
    }
}