package com.example.cobariwayatmakanan.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.provider.BaseColumns;

public class OrderHelper extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 1;
    public static final String DATABSE_NAME = "ord.db";

    public OrderHelper(Context context) {
        super(context, DATABSE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_TABLE = "CREATE TABLE " + OrderContact.OrderEntry.TABLE_NAME + " ("
                + OrderContact.OrderEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +  OrderContact.OrderEntry.COLUMN_NAME + " TEXT NOT NULL, "
                +  OrderContact.OrderEntry.COLUMN_QUANTITY + " TEXT NOT NULL, "
                +  OrderContact.OrderEntry.COLUMN_PRICE + " TEXT NOT NULL, "
                +  OrderContact.OrderEntry.COLUMN_TUNAI + " TEXT NOT NULL, "
                +  OrderContact.OrderEntry.COLUMN_DEBITBCA + " TEXT NOT NULL,"
                +  OrderContact.OrderEntry.COLUMN_OVO + " TEXT NOT NULL);";

        db.execSQL(SQL_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
