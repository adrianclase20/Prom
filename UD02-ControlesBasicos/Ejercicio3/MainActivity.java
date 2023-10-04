package com.example.ud02_ejer3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextDNI = findViewById(R.id.editTextDNI);
        EditText editTextLetra = findViewById(R.id.editTextLetra);
        Button btnValidar = findViewById(R.id.btnValidar);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dni = editTextDNI.getText().toString();
                String letra = editTextLetra.getText().toString();

                if (validarDNI(dni, letra)) {
                    textViewResultado.setText("DNI válido.");
                } else {
                    textViewResultado.setText("DNI no válido.");
                }
            }
        });
    }

    private boolean validarDNI(String dni, String letra) {
        if (dni.length() != 8) {
            return false;
        }

        try {
            int numeroDNI = Integer.parseInt(dni);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int resto = numeroDNI % 23;
            char letraCalculada = letras.charAt(resto);

            return letraCalculada == letra.charAt(0);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
