package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSuma, btnResta, btnMultiplicacion, btnDivision, btnLimpiar;
    EditText txtnum1, txtnum2;
    TextView resultado;
    double num1;
    double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText)findViewById(R.id.num1);
        txtnum2 = (EditText)findViewById(R.id.num2);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        resultado = (TextView)findViewById(R.id.resultado);

            btnSuma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Double.parseDouble(txtnum1.getText().toString());
                    num2 = Double.parseDouble(txtnum2.getText().toString());
                    resultado.setText(String.valueOf(num1+num2));
                }
            });
            btnResta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Double.parseDouble(txtnum1.getText().toString());
                    num2 = Double.parseDouble(txtnum2.getText().toString());
                    resultado.setText(String.valueOf(num1-num2));
                }
            });
            btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Double.parseDouble(txtnum1.getText().toString());
                    num2 = Double.parseDouble(txtnum2.getText().toString());
                    resultado.setText(String.valueOf(num1*num2));
                }
            });
            btnDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Double.parseDouble(txtnum1.getText().toString());
                    num2 = Double.parseDouble(txtnum2.getText().toString());
                    if(num2 != 0)
                    {
                        resultado.setText(String.valueOf(num1/num2));
                    }
                    else
                    {
                        resultado.setText("NOOO AMIGO 0 NOOOOOOOOOOOOOOOOOOO");
                    }

                }
            });
            btnLimpiar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtnum1.setText("");
                    txtnum2.setText("");
                }
            });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        resultado.setText("HAAA PERRRRRRRRRRO");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}