package com.example.examenu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario,pass;
    Button btnlogin;
    Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=findViewById(R.id.user);
        pass=findViewById(R.id.password);
        btnlogin=findViewById(R.id.btnLogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuario.getText().toString().equals("DM1p22B")&& pass.getText().toString().equals("ivan")){
                    Toast.makeText(MainActivity.this, "Datos correctos", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,Bienvenida.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSalir=findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hasta Pronto", Toast.LENGTH_SHORT).show();
                finishAffinity();
            }
        });
    }
}