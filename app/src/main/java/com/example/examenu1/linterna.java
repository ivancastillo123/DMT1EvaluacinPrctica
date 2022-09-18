package com.example.examenu1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class linterna extends AppCompatActivity {
    protected boolean isopent = false;
    private CameraManager manager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linterna);

        ImageButton im = findViewById(R.id.buttonLinterna);
        manager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        ImageButton Button1 =  findViewById(R.id.buttonLinterna);

        Button1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if(!isopent)
                {      try {
                    Toast.makeText(linterna.this,"Linterna Encendida",Toast.LENGTH_LONG).show();
                    im.setBackgroundResource(R.drawable.prendido);
                    manager.setTorchMode("0", true);
                } catch (CameraAccessException e) {
                    e.printStackTrace();
                } isopent=true;
                }
                else
                {
                    try {
                        Toast.makeText(linterna.this,"Linterna Apagada",Toast.LENGTH_LONG).show();
                        im.setBackgroundResource(R.drawable.apagado);
                        manager.setTorchMode("0", false);
                    } catch (CameraAccessException e) {
                        e.printStackTrace();
                    }
                    isopent=false;
                }
            }
        });


        Button regresa=findViewById(R.id.btnregresamenuL);
        regresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}