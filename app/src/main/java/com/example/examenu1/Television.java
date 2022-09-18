package com.example.examenu1;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.examenu1.R;

public class Television extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_television);

            VideoView introVideo = (VideoView) findViewById(R.id.videoView);


            MediaController mediaController = new MediaController(this);

            Button btn1=findViewById(R.id.btnestacion1);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri ubicacion = Uri.parse("android.resource://" +  getPackageName() + "/"+
                            R.raw.dos);


                    introVideo.setVideoURI(ubicacion);
                    introVideo.start();
                }
            });

            Button btn2=findViewById(R.id.btnestacion2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri ubicacion = Uri.parse("android.resource://" +  getPackageName() + "/"+
                            R.raw.uno);

                    introVideo.setVideoURI(ubicacion);
                    introVideo.start();
                }
            });

            Button btn3=findViewById(R.id.btnestacion3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri ubicacion = Uri.parse("android.resource://" +  getPackageName() + "/"+
                            R.raw.tres);


                    introVideo.setVideoURI(ubicacion);
                    introVideo.start();
                }
            });


            ImageButton regresa=findViewById(R.id.btnregresamenu);
            regresa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    finish();
                }
            });

    }
}
