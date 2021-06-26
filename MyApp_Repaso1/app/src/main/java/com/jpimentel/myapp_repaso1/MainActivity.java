package com.jpimentel.myapp_repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        if(view.getId()==R.id.btnUno) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btnResta) {
            Intent intent = new Intent(this, MA_Resta.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btnMulti) {
            Intent intent = new Intent(this, MA_Multiplicacion.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btnDiv) {
            Intent intent = new Intent(this, MA_Division.class);
            startActivity(intent);
        }

    }
}