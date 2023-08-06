package com.example.cobariwayatmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoryFoodActivity extends AppCompatActivity {

    private Button btnBackmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_food);

        btnBackmenu = findViewById(R.id.btn_backmenu);
        btnBackmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryFoodActivity.this, MainActivity.class);
                startActivity(intent);

//                payment();
            }
        });
    }
}