package com.example.ud02_ejer4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnImagenYahoo (View v){
        ImageView img = (ImageView)findViewById(R.id.imgFoto);
        img.setImageResource(R.drawable.yahoo);
    }
    public void btnImagenGoogle (View v){
        ImageView img = (ImageView)findViewById(R.id.imgFoto);
        img.setImageResource(R.drawable.google);
    }
    public void btnImagenBing (View v){
        ImageView img = (ImageView)findViewById(R.id.imgFoto);
        img.setImageResource(R.drawable.bing);
    }


}