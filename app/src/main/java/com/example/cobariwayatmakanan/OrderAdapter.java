package com.example.cobariwayatmakanan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    private List<Model> modelList;

    public OrderAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int images = modelList.get(position).getmFoodPhoto();

        Model currentItem = modelList.get(position);
        holder.mFoodName.setText(currentItem.getmFoodName());
        holder.mFoodDetail.setText(currentItem.getmFoodDetail());
        holder.mFoodPrice.setText(String.valueOf(currentItem.getmFoodPrice())); // Menggunakan String.valueOf untuk mengubah int menjadi String
        holder.imageView.setImageResource(images);
        holder.quantityTextView.setText(String.valueOf(currentItem.getQuantity()));

        holder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 20000;
                currentItem.setQuantity(currentItem.getQuantity() + 1);
                int totalPrice = basePrice * currentItem.getQuantity();
                holder.totalHargaTextView.setText("Rp." + totalPrice);
                holder.quantityTextView.setText(String.valueOf(currentItem.getQuantity()));
            }
        });

        holder.minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentItem.getQuantity() > 0) {
                    currentItem.setQuantity(currentItem.getQuantity() - 1);
                    int basePrice = 20000;
                    int totalPrice = basePrice * currentItem.getQuantity();
                    holder.totalHargaTextView.setText("Rp." + totalPrice);
                    holder.quantityTextView.setText(String.valueOf(currentItem.getQuantity()));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mFoodName, mFoodDetail, mFoodPrice, quantityTextView, totalHargaTextView;
        ImageView imageView;
        ImageButton addButton, minusButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.foodImage);
            mFoodName = itemView.findViewById(R.id.foodName);
            mFoodDetail = itemView.findViewById(R.id.description);
            mFoodPrice = itemView.findViewById(R.id.harga);
            quantityTextView = itemView.findViewById(R.id.quantity);
            totalHargaTextView = itemView.findViewById(R.id.total_harga);
            addButton = itemView.findViewById(R.id.btnAdd);
            minusButton = itemView.findViewById(R.id.btnMinus);
        }
    }
}
