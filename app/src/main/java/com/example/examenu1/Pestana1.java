package com.example.examenu1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pestana1 extends Fragment {
    TextView fecha,dia,mes,año,hora;
    Button btn;

    TextView txt;
    Integer counter = 1;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.pestana1, container, false);
        // Inflate the layout for this fragment
        Date date=new Date();
        fecha= root.findViewById(R.id.txtFecha);
        SimpleDateFormat fechaC=new SimpleDateFormat("d,MMMM 'del' , yyyy");
        String sFecha =fechaC.format(date);
        fecha.setText(sFecha);

        dia=root.findViewById(R.id.txtDia);
        SimpleDateFormat d=new SimpleDateFormat("EEEE");
        String sdia =d.format(date);
        dia.setText(sdia);

        mes=root.findViewById(R.id.txtMes);
        SimpleDateFormat m=new SimpleDateFormat("MMMM");
        String sMes =m.format(date);
        mes.setText(sMes);

        año=root.findViewById(R.id.txtAño);
        SimpleDateFormat a=new SimpleDateFormat("yyyy");
        String sAño =a.format(date);
        año.setText(sAño);

        hora=root.findViewById(R.id.txtHora);
        SimpleDateFormat h=new SimpleDateFormat("h:mm a");
        String sHora =h.format(date);
        hora.setText(sHora);
        return root;
    }
}