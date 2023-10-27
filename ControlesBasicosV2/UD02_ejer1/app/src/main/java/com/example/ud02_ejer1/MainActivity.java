package com.example.ud02_ejer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText txtPrimero, txtSegundo;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPrimero = findViewById(R.id.txtPrimero);
        txtSegundo = findViewById(R.id.txtSegundo);
        lblResultado = findViewById(R.id.lblResultado);



    }
    public void calcularDividir(View v) {
        String s1 = txtPrimero.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = txtSegundo.getText().toString();
        double d2 = Double.parseDouble(s2);

        lblResultado.setText("Resultado: "+(d1/d2));
    }
    public void calcularResta(View v) {
        String s1 = txtPrimero.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = txtSegundo.getText().toString();
        double d2 = Double.parseDouble(s2);

        lblResultado.setText("Resultado: "+(d1-d2));
    }
    public void calcularSuma(View v) {
        String s1 = txtPrimero.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = txtSegundo.getText().toString();
        double d2 = Double.parseDouble(s2);

        lblResultado.setText("Resultado: "+(d1+d2));
    }
    public void calcularMultiplicar(View v) {
        String s1 = txtPrimero.getText().toString();
        double d1 = Double.parseDouble(s1);
        String s2 = txtSegundo.getText().toString();
        double d2 = Double.parseDouble(s2);

        lblResultado.setText("Resultado: "+(d1*d2));
    }

}

