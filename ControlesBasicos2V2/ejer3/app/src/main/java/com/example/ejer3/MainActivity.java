package com.example.ejer3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextNombre, editTextApellido;
    RadioGroup radioGroupSexo;
    Button buttonMostrarDatos;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        radioGroupSexo = findViewById(R.id.radioGroupSexo);
        buttonMostrarDatos = findViewById(R.id.buttonMostrarDatos);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        buttonMostrarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDatos();
            }
        });
    }

    private void mostrarDatos() {
        String nombre = editTextNombre.getText().toString();
        String apellido = editTextApellido.getText().toString();
        int selectedSexoId = radioGroupSexo.getCheckedRadioButtonId();
        RadioButton selectedSexo = findViewById(selectedSexoId);
        String sexo = selectedSexo.getText().toString();

        // Obtener selecciones de casillas de verificación
        boolean seleccionado1 = checkBox1.isChecked();
        boolean seleccionado2 = checkBox2.isChecked();
        boolean seleccionado3 = checkBox3.isChecked();
        boolean seleccionado4 = checkBox4.isChecked();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        intent.putExtra("sexo", sexo);
        intent.putExtra("seleccionado1", seleccionado1);
        intent.putExtra("seleccionado2", seleccionado2);
        intent.putExtra("seleccionado3", seleccionado3);
        intent.putExtra("seleccionado4", seleccionado4);
        startActivity(intent);
    }
}
