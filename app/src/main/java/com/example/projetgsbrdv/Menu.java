package com.example.projetgsbrdv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void pagePriseRDV(View view) {
        Intent intentAfficher = new Intent(this, PriseRDV.class);
        startActivity(intentAfficher);
    }

    public void pageAffichageRDV(View view) {
        Intent intentAfficher = new Intent(this, AffichageRDV.class);
        startActivity(intentAfficher);
    }

    public void pageEnregistrerProfessionnel(View view) {
        Intent intentAfficher = new Intent(this, AffichageProfessionnel.class);
        startActivity(intentAfficher);
    }

    public void PageEnregistrerProfessionnel(View view) {
        Intent intentAfficher = new Intent(this, EnregistrerProfessionnel.class);
        startActivity(intentAfficher);
    }
}