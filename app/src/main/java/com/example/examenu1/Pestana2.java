package com.example.examenu1;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Pestana2 extends Fragment {

    private ProgressBar progressBar;
    TextView txt;
    Integer counter = 1;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.pestana2, container, false);
        counter = 1;
        progressBar = (ProgressBar) root.findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);
        progressBar.setProgress(0);

        new MyAsyncTask().execute(10);

        return root;
    }

    class MyAsyncTask extends AsyncTask<Integer, Integer, String> {
        @Override
        protected String doInBackground(Integer... params) {
            for (; counter <= params[0]; counter++) {
                try {
                    Thread.sleep(1000);

                    publishProgress(counter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Tarea completa!. =)";
        }

        @Override
        protected void onPostExecute(String result) {
            progressBar.setVisibility(View.GONE);


        }

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            progressBar.setProgress(values[0]);
        }


    }

}


