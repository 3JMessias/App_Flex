package com.unipac.myapp_alcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valorAlcool;
    EditText valorGasolina;
    TextView mensagem;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorAlcool = (EditText) findViewById(R.id.edtextValorAlcool);
        valorGasolina = (EditText) findViewById(R.id.edtextValorGasolina);
        botao = (Button) findViewById(R.id.button);

        Double vlrAlcoll = Double.parseDouble(valorAlcool.getText().toString());
        Double vlrGasolina = Double.parseDouble(valorGasolina.getText().toString());
        Double resultado;

        resultado = vlrAlcoll / vlrGasolina;

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicou no botão", Toast.LENGTH_LONG).show();
            }
        });
    }

    }

