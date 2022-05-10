package com.example.projetgsbrdv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Spinner;

public class AffichageRDV extends AppCompatActivity {
    Modele db;
    CalendarView choixAffichageRDV;
    Spinner AffichageRDV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_rdv);

        choixAffichageRDV = findViewById(R.id.calendarViewAfficher);
        AffichageRDV = findViewById(R.id.AffichageRdv);
        db = new Modele(this);
    }
}