package com.example.layouty;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Product> products = new ArrayList<>();
        products.add(new Product("Produkt 1", "Opis 1"));
        products.add(new Product("Produkt 2", "Opis 2"));
        products.add(new Product("Produkt 3", "Opis 3"));
        products.add(new Product("Produkt 4", "Opis 4"));
        products.add(new Product("Produkt 5", "Opis 5"));
        products.add(new Product("Produkt 6", "Opis 6"));
        products.add(new Product("Produkt 7", "Opis 7"));
        products.add(new Product("Produkt 8", "Opis 8"));

        ProductAdapter adapter = new ProductAdapter(this, products);
        recyclerView.setAdapter(adapter);
    }
}