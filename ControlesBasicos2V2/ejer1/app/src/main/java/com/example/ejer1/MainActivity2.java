package com.example.ejer1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView textViewDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewDatos = findViewById(R.id.textViewDatos);

        Intent intent = getIntent();
        if (intent != null) {
            String datos = intent.getStringExtra("datos");
            textViewDatos.setText(datos);
        }

        Button botonAceptar = findViewById(R.id.botonAceptar);
        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Volver a la pantalla 1 (MainActivity)
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button botonRechazar = findViewById(R.id.botonRechazar);
        botonRechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Volver a la pantalla 1 (MainActivity)
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
