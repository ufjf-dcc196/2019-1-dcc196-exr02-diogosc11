package com.example.exercicio02;

import android.support.v7.app.AppCompatActivity;
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

        final TextView resultado = findViewById(R.id.resultado);

        final EditText num01 = findViewById(R.id.num01);
        final EditText num02 = findViewById(R.id.num02);


        Button soma = findViewById(R.id.soma);
        Button subtracao = findViewById(R.id.sub);
        Button multiplicacao = findViewById(R.id.mult);
        Button divisao = findViewById(R.id.div);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int x = Integer.parseInt(num01.getText().toString());
                final int y = Integer.parseInt(num02.getText().toString());
                resultado.setText(String.valueOf(x+y));
            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int x = Integer.parseInt(num01.getText().toString());
                final int y = Integer.parseInt(num02.getText().toString());
                resultado.setText(String.valueOf(x-y));
            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int x = Integer.parseInt(num01.getText().toString());
                final int y = Integer.parseInt(num02.getText().toString());
                resultado.setText(String.valueOf(x*y));
            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int x = Integer.parseInt(num01.getText().toString());
                final int y = Integer.parseInt(num02.getText().toString());
                if(y == 0){
                    resultado.setText("Não é possível dividir por zero");
                }
                else {
                    resultado.setText(String.valueOf(x / y));
                }
            }
        });

    }
}
