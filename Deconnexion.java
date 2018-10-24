package com.example.alexm.projetl3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Deconnexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deconnexion);


        Button creer=findViewById(R.id.creerEvenement);
        Button amis=findViewById(R.id.mesamis);
        Button evenements=findViewById(R.id.mesEvenements);

        creer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent cree=new Intent(Deconnexion.this, CreerEvenement.class);
                startActivity(cree);
                finish();

            }
        });

        amis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent ami=new Intent(Deconnexion.this, MesAmis.class);
                startActivity(ami);
                finish();

            }
        });
        evenements.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent evenement=new Intent(Deconnexion.this, MesEvenements.class);
                startActivity(evenement);
                finish();

            }
        });

    }
}
