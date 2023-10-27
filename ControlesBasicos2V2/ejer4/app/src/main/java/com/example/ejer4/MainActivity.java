package com.example.ejer4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText makeEditText, modelEditText, yearEditText;
    private TextView displayMake, displayModel, displayYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeEditText = findViewById(R.id.editTextMake);
        modelEditText = findViewById(R.id.editTextModel);
        yearEditText = findViewById(R.id.editTextYear);
    }
    public void onBackClick(View view) {
        // Volver a la primera pestaña
        setContentView(R.layout.activity_main);

        // Reinicializar los campos de entrada
        makeEditText = findViewById(R.id.editTextMake);
        modelEditText = findViewById(R.id.editTextModel);
        yearEditText = findViewById(R.id.editTextYear);

        // Limpiar los campos de entrada
        makeEditText.setText("");
        modelEditText.setText("");
        yearEditText.setText("");
    }

    public void onSaveClick(View view) {
        // Obtener los datos introducidos por el usuario
        String make = makeEditText.getText().toString();
        String model = modelEditText.getText().toString();
        String year = yearEditText.getText().toString();

        // Mostrar los datos en la segunda pestaña
        setContentView(R.layout.activity_main2);

        displayMake = findViewById(R.id.textViewMake);
        displayModel = findViewById(R.id.textViewModel);
        displayYear = findViewById(R.id.textViewYear);

        displayMake.setText("Marca: " + make);
        displayModel.setText("Modelo: " + model);
        displayYear.setText("Año: " + year);
    }
}
