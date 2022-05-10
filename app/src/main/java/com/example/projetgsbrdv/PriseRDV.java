package com.example.projetgsbrdv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;

public class PriseRDV extends AppCompatActivity {
    Modele db;
    Spinner choixProfessionnelRDV;
    CalendarView choixDateRDV;
    EditText choixHeureRDV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prise_rdv);

        choixProfessionnelRDV = findViewById(R.id.spinnerChoixProfessionnel);
        choixDateRDV = findViewById(R.id.calendarViewChoixDateRDV);
        choixHeureRDV = findViewById(R.id.editTextChoixHeureRDV);
        db = new Modele(this);
    }
}