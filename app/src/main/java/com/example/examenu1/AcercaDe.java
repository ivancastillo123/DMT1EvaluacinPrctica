package com.example.examenu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.google.android.material.resources.MaterialAttributes;

public class AcercaDe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        DisplayMetrics MedidaVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(MedidaVentana);

        int ancho = MedidaVentana.widthPixels;
        int  alto=MedidaVentana.heightPixels;

        getWindow().setLayout((int) (ancho * 0.85),(int)(alto*0.3));


        TextView info=findViewById(R.id.info);


        info.setText("Alumno: Ivan Jafeth Castillo Escobar\n"
                +"Numero Control: L18301248\n"
                +"Materia: Desarrollo de Applicaciones Moviles\n"
                +"Docente: Rocio Elizabeth Pulido Alba \n");







    }





}