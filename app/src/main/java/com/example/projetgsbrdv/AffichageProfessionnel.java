package com.example.projetgsbrdv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Collections;

public class AffichageProfessionnel extends AppCompatActivity {
    Modele db ;
    Spinner AfficherProfessionnel ;
    EditText ChoixAdresse ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_professionnel);

        AfficherProfessionnel = findViewById(R.id.spinnerAffichageProfessionnel);
        ChoixAdresse = findViewById(R.id.editTextChoixAdresse);
        db = new Modele(this);
    }

    public void clicAffichageProfessionnel(View view){
        String result;

        result = db.rechercheProfessionnel(ChoixAdresse.getText().toString());

        ArrayAdapter<String> AffichagePro = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, result);
        AffichagePro.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AfficherProfessionnel.setAdapter(AffichagePro);
    }
}