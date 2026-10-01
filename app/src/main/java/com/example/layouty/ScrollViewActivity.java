package com.example.layouty;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ScrollViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        findViewById(R.id.btnRegister).setOnClickListener(v ->
                Toast.makeText(this, "Formularz przesłany!", Toast.LENGTH_SHORT).show());
    }
}