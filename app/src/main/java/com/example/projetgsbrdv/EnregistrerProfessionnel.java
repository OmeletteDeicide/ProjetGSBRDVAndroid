package com.example.projetgsbrdv;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;
public class EnregistrerProfessionnel extends AppCompatActivity {
    Modele db;
    EditText nom;
    EditText prenom;
    EditText type;
    EditText mail;
    EditText telephone;
    EditText adresse;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.editTextNom);
        prenom = findViewById(R.id.editTextPrenom);
        type = findViewById(R.id.editTextType);
        mail = findViewById(R.id.editTextMail);
        telephone = findViewById(R.id.editTextTel);
        adresse = findViewById(R.id.editTextAdresse);
        db = new Modele(this);
    }

    public void clicEnregistrer(View view){
        db.enregistrerProfessionnel(nom.getText().toString(), prenom.getText().toString(), type.getText().toString(),
                mail.getText().toString(), telephone.getText().toString(), adresse.getText().toString());
    }


}