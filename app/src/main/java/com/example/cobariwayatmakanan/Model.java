package com.example.cobariwayatmakanan;

public class Model {

    String mFoodName;
    String mFoodDetail;
    int mFoodPrice;
    int mFoodPhoto;
    private int quantity;

    public Model(String mFoodName, String mFoodDetail, int mFoodPrice, int mFoodPhoto) {
        this.mFoodName = mFoodName;
        this.mFoodDetail = mFoodDetail;
        this.mFoodPhoto = mFoodPhoto;
        this.mFoodPrice = mFoodPrice;
        this.quantity = quantity;
    }



    public String getmFoodName() {

        return mFoodName;
    }
    public String getmFoodDetail() {

        return mFoodDetail;
    }

    public int getmFoodPrice() {

        return mFoodPrice;
    }
    public int getmFoodPhoto() {

        return mFoodPhoto;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}