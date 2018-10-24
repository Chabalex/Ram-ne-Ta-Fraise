package com.example.alexm.projetl3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MesAmis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_amis);

        Button creer=findViewById(R.id.creerEvenement);
        Button deco=findViewById(R.id.deconnexion);
        Button evenements=findViewById(R.id.mesEvenements);

        creer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent cree=new Intent(MesAmis.this, CreerEvenement.class);
                startActivity(cree);
                finish();

            }
        });
        deco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent dec=new Intent(MesAmis.this, Deconnexion.class);
                startActivity(dec);
                finish();

            }
        });
        evenements.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent evenement=new Intent(MesAmis.this, MesEvenements.class);
                startActivity(evenement);
                finish();

            }
        });
    }
}
