package com.example.cobariwayatmakanan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {
    private RecyclerView recyclerView;
    private OrderAdapter mAdapter;
    private List<Model> modelList;

    private Button btn_historypesan;

    private Button btn_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelList = new ArrayList<>();
        modelList.add(new Model("Nasi Uduk","hidangan yang dibuat dari nasi putih yang diaron dan dikukus", 20000, R.drawable.nasiuduk ));
        modelList.add(new Model("Nasi Goreng Babat", getString(R.string.nasigoreng),35000, R.drawable.nasigoreng));
        modelList.add(new Model("Lontong Sayur", getString(R.string.lontongsayur), 15000, R.drawable.lontong));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        mAdapter = new OrderAdapter(modelList);
        recyclerView.setAdapter(mAdapter);

        btn_historypesan = findViewById(R.id.btn_historypesan);
        btn_payment = findViewById(R.id.btn_payment);

        btn_historypesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HistoryFoodActivity.class);
                startActivity(intent);
            }
        });

        btn_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListFoodActivity.class);
                startActivity(intent);

//                payment();
            }
        });
    }

    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {

    }
}