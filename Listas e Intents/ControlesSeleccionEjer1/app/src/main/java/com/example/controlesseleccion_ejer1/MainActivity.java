package com.example.controlesseleccion_ejer1;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner selectorPaises;
    private TextView informacionTextView;

    // Datos de países (nombre, superficie, habitantes)
    private String[][] datosPaises = {
            {"España", "1000km2", "4M"},
            {"Andorra", "60km2", "25k"},
            {"Alemania", "8000km2", "5M"},
            // Agrega más países con sus datos
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectorPaises = findViewById(R.id.selectorPaises);
        informacionTextView = findViewById(R.id.informacionTextView);

        // Crear un adaptador para el Spinner
        ArrayAdapter<String> adaptadorPaises = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, obtenerNombresPaises());
        adaptadorPaises.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectorPaises.setAdapter(adaptadorPaises);

        // Establecer el listener para el Spinner
        selectorPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Cuando se selecciona un país, muestra la información en el TextView
                String nombrePais = datosPaises[position][0];
                String superficiePais = datosPaises[position][1];
                String poblacionPais = datosPaises[position][2];
                informacionTextView.setText("País: " + nombrePais + "\nSuperficie: " + superficiePais + "\nHabitantes: " + poblacionPais);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Cuando no se ha seleccionado nada, puedes realizar alguna acción si es necesario.
            }
        });
    }

    // Función para obtener los nombres de los países
    private String[] obtenerNombresPaises() {
        String[] nombresPaises = new String[datosPaises.length];
        for (int i = 0; i < datosPaises.length; i++) {
            nombresPaises[i] = datosPaises[i][0];
        }
        return nombresPaises;
    }
}
