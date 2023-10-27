package com.example.ejer1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre, editTextApellido;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        textViewResultado = findViewById(R.id.textViewResultado);

        Button botonSiguiente = findViewById(R.id.botonSiguiente);
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String datos = "Hola " + nombre + " " + apellido +" ¿Aceptas las Condiciones? ";
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("datos", datos);
                startActivity(intent);
            }
        });
        Button botonVolver = findViewById(R.id.botonVolver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String datos = "Hola " + nombre + " " + apellido +" ¿Aceptas las Condiciones? ";
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("datos", datos);
                startActivity(intent);
            }
        });
    }
}
