package com.example.alexm.projetl3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MesEvenements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_evenements);

        Button creer=findViewById(R.id.creerEvenement);
        Button deco=findViewById(R.id.deconnexion);
        Button amis=findViewById(R.id.mesamis);

        creer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent cree=new Intent(MesEvenements.this, CreerEvenement.class);
                startActivity(cree);
                finish();

            }
        });
        deco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent dec=new Intent(MesEvenements.this, Deconnexion.class);
                startActivity(dec);
                finish();

            }
        });
        amis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent ami=new Intent(MesEvenements.this, MesAmis.class);
                startActivity(ami);
                finish();

            }
        });
    }
}
