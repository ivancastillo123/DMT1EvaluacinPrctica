package com.example.examenu1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Bienvenida extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);



        ImageButton btnAcerca;
        btnAcerca=findViewById(R.id.btnAcercade);
        btnAcerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),AcercaDe.class);
                startActivity(intent);
            }
        });

        ImageButton radio;
        radio=findViewById(R.id.btnTelevision);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), Television.class);
                startActivity(intent);
            }
        });

        ImageButton cam;
        cam=findViewById(R.id.btnCamaraBienvenido);
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Camara.class);
                startActivity(intent);
            }
        });


        ImageButton linerna;
        linerna=findViewById(R.id.btnlinterna);
        linerna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),linterna.class);
                startActivity(intent);
            }
        });


        ImageButton pe;
        pe=findViewById(R.id.btnPestania);
        pe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), PestanaMenu.class);
                startActivity(intent);
            }
        });

        ImageButton reg;
        reg=findViewById(R.id.btnsalirbienvenida);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Bienvenida.this,"Terminando aplicacion",Toast.LENGTH_LONG).show();
                onStop();
                finish();
            }
        });





    }

}