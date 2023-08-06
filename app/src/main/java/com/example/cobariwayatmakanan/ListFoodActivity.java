package com.example.cobariwayatmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class ListFoodActivity extends AppCompatActivity {

    private Button payButton;
    private List<Model> modelList;
    private OrderAdapter mAdapter;
    private CheckBox paymentCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);

        modelList = new ArrayList<>();

        // Tambahkan item pesanan ke dalam modelList
        mAdapter = new OrderAdapter(modelList);
        payButton = findViewById(R.id.btnPay);
        paymentCheckBox = findViewById(R.id.tunai);
        paymentCheckBox = findViewById(R.id.debitbca);
        paymentCheckBox = findViewById(R.id.ovo);


        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil nilai dari checkbox dan melakukan tindakan pembayaran
                boolean cashPayment = paymentCheckBox.isChecked();
                Intent intent = new Intent(ListFoodActivity.this, HistoryFoodActivity.class);
                startActivity(intent);
                // Lakukan tindakan pembayaran sesuai dengan nilai checkbox
                // Contoh: Jika cashPayment true, lakukan pembayaran tunai.

            }
        });
    }
}