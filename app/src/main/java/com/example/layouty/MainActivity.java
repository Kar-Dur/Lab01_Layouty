package com.example.layouty;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLinearLayout).setOnClickListener(v ->
                startActivity(new Intent(this, LinearLayoutActivity.class)));

        findViewById(R.id.btnConstraintLayout).setOnClickListener(v ->
                startActivity(new Intent(this, ConstraintLayoutActivity.class)));

        findViewById(R.id.btnRelativeLayout).setOnClickListener(v ->
                startActivity(new Intent(this, RelativeLayoutActivity.class)));

        findViewById(R.id.btnFrameLayout).setOnClickListener(v ->
                startActivity(new Intent(this, FrameLayoutActivity.class)));

        findViewById(R.id.btnTableLayout).setOnClickListener(v ->
                startActivity(new Intent(this, TableLayoutActivity.class)));

        findViewById(R.id.btnScrollView).setOnClickListener(v ->
                startActivity(new Intent(this, ScrollViewActivity.class)));

        findViewById(R.id.btnRecyclerView).setOnClickListener(v ->
                startActivity(new Intent(this, RecyclerViewActivity.class)));
    }
}