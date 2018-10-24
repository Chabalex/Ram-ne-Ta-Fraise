package com.example.alexm.projetl3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button creer=findViewById(R.id.creerEvenement);
        Button deco=findViewById(R.id.deconnexion);
        Button amis=findViewById(R.id.mesamis);
        Button evenements=findViewById(R.id.mesEvenements);

        creer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent cree=new Intent(MainActivity.this, CreerEvenement.class);
                startActivity(cree);
            }
        });
        deco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent dec=new Intent(MainActivity.this, Deconnexion.class);
                startActivity(dec);
            }
        });
        amis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent ami=new Intent(MainActivity.this, MesAmis.class);
                startActivity(ami);
            }
        });
        evenements.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent evenement=new Intent(MainActivity.this, MesEvenements.class);
                startActivity(evenement);
            }
        });
    }



}
