package com.example.projetgsbrdv;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class Modele extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "ProjetGSB.db";
    public static final String TABLE_NAME = "Professionnel";
    public static final String Col_1 = "ID";
    public static final String Col_2 = "Nom";
    public static final String Col_3 = "Prenom";
    public static final String Col_4 = "Type";
    public static final String Col_5 = "Mail";
    public static final String Col_6 = "Tel";
    public static final String Col_10 = "Adresse";
    public static final String TABLE_NAME_2 = "RDV";
    public static final String Col_7 = "Date";
    public static final String Col_8 = "Heure";
    public static final String Col_9 = "Professionnel";


    public Modele(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Nom TEXT, Prenom TEXT, Type TEXT," +
                " Mail TEXT, Tel TEXT)");
        db.execSQL("CREATE table " + TABLE_NAME_2 + "(Nom DATE, Heure TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_2);
        onCreate(db);
    }

    public void enregistrerProfessionnel(String nom, String prenom, String type, String mail, String tel, String adresse){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(Col_2, nom);
        cv.put(Col_3, prenom);
        cv.put(Col_4, type);
        cv.put(Col_5, mail);
        cv.put(Col_6, tel);
        cv.put(Col_10,adresse);

        db.insert(TABLE_NAME, null, cv);
        db.close();
    }

    public void priseRDV(String Date, String Heure){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(Col_7, Date);
        cv.put(Col_8, Heure);

        db.insert(TABLE_NAME_2, null, cv);
        db.close();
    }

    public String rechercheProfessionnel(String adresse){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery("Select nom, prenom, type From " + TABLE_NAME + " WHERE Adresse LIKE %" + adresse + "%", null);
        String Professionnel= result.toString();
        return Professionnel;
    }

    //public Cursor affichageRDV(){
    //    SQLiteDatabase db = this.getReadableDatabase();
    //    Cursor result = db.rawQuery("Select Heure, Professionnel From " + TABLE_NAME_2 + " WHERE Date = " +, null);
    //    return result;
    //}

    public Cursor alimenterSpinProfessionnel(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor result = db.rawQuery("Select nom, prenom, type From  " + TABLE_NAME, null);
        return result;
    }

}
