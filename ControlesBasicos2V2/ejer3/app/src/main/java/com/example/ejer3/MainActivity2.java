package com.example.ejer3;



import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewNombre, textViewApellido, textViewSexo, textViewSeleccionados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewNombre = findViewById(R.id.textViewNombre);
        textViewApellido = findViewById(R.id.textViewApellido);
        textViewSexo = findViewById(R.id.textViewSexo);
        textViewSeleccionados = findViewById(R.id.textViewSeleccionados);

        // Recuperar los datos pasados desde la primera pantalla
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            String apellido = extras.getString("apellido");
            String sexo = extras.getString("sexo");

            // Mostrar los datos en la segunda pantalla
            textViewNombre.setText("Nombre: " + nombre);
            textViewApellido.setText("Apellido: " + apellido);
            textViewSexo.setText("Sexo: " + sexo);

            // Recuperar y mostrar selecciones de casillas de verificación
            boolean seleccionado1 = extras.getBoolean("seleccionado1");
            boolean seleccionado2 = extras.getBoolean("seleccionado2");
            boolean seleccionado3 = extras.getBoolean("seleccionado3");
            boolean seleccionado4 = extras.getBoolean("seleccionado4");

            StringBuilder seleccionadosText = new StringBuilder("Aficciones: ");
            if (seleccionado1) {
                seleccionadosText.append("Musica, ");
            }
            if (seleccionado2) {
                seleccionadosText.append("Lectura, ");
            }
            if (seleccionado3) {
                seleccionadosText.append("Deporte, ");
            }
            if (seleccionado4) {
                seleccionadosText.append("Viajar, ");
            }

            if (seleccionadosText.length() > 0) {
                seleccionadosText.setLength(seleccionadosText.length() - 2); // Eliminar la última coma y espacio
            } else {
                seleccionadosText.append("Ninguno");
            }
            textViewSeleccionados.setText(seleccionadosText.toString());
        }
    }
}
