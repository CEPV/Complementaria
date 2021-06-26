package com.jpimentel.myapp_repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MA_Division extends AppCompatActivity {
    private EditText campo1, campo2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_division);

        campo1 = findViewById(R.id.txtN1);
        campo2 = findViewById(R.id.txtN2);
        resultado = findViewById(R.id.txtResultado);
    }
    //Metodos a utilizar
    private void dividir(){
        String num1 = campo1.getText().toString();
        String num2 = campo2.getText().toString();
        //Validacion de campos vacíos
        if(!num1.isEmpty() && !num2.isEmpty()){
            int dividir = Integer.parseInt(num1) / Integer.parseInt(num2);

            resultado.setText("La división es: "+dividir);
        }
        else{
            Toast.makeText(this, "Campos vacíos", Toast.LENGTH_SHORT).show();
        }

    }

    public void onClick(View view) {
        if(view.getId() == R.id.btnDiv){
            this.dividir();
        }
    }
}