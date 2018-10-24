package com.example.alexm.projetl3;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class CreerEvenement extends AppCompatActivity {

    Button bdate,bheure;
    EditText edate,eheure;
    private int jour,mois,annee,heure,minutes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_evenement);

        Button deco=findViewById(R.id.deconnexion);
        Button amis=findViewById(R.id.mesamis);
        Button evenements=findViewById(R.id.mesEvenements);
        Button bdate=findViewById(R.id.boutonDate);
        Button bheure=findViewById(R.id.boutonHeure);
        EditText edate=findViewById(R.id.date);
        EditText eheure=findViewById(R.id.heure);

        deco.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent dec=new Intent(CreerEvenement.this, Deconnexion.class);
                startActivity(dec);
                finish();

            }
        });
        amis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent ami=new Intent(CreerEvenement.this, MesAmis.class);
                startActivity(ami);
                finish();

            }
        });
        evenements.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent evenement=new Intent(CreerEvenement.this, MesEvenements.class);
                startActivity(evenement);
                finish();




            }
        });


    }
    public void onClick (View v) {
        if(v==bdate){
            final Calendar c= Calendar.getInstance();
            jour=c.get(Calendar.DAY_OF_MONTH);
            mois=c.get(Calendar.MONTH);
            annee=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    edate.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);
                }
            }
                    ,jour,mois,annee);
            datePickerDialog.show();
        }

        if(v==bheure){
            final Calendar c= Calendar.getInstance();
            heure=c.get(Calendar.HOUR_OF_DAY);
            minutes=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    eheure.setText(hourOfDay+":"+minute);
                }
            },heure,minutes,false);
            timePickerDialog.show();

        }
    }

}
