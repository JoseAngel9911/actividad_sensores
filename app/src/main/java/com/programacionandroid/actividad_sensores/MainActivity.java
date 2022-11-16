package com.programacionandroid.actividad_sensores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        Button btnListaSensors;
        Button btnAproximidadSensors;
        Button btnAcelerometroSensors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListaSensors = (Button) findViewById(R.id.btnlistasensors);
        btnListaSensors.setOnClickListener(w -> implicito());

        btnAproximidadSensors = (Button) findViewById(R.id.btnaproximasensor);
        btnAproximidadSensors.setOnClickListener(w -> aproxima());

        btnAcelerometroSensors = (Button) findViewById(R.id.btnacelerometrosensor);
        btnAcelerometroSensors.setOnClickListener(w -> acelerometro());

    }

    public void implicito(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void aproxima(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void acelerometro(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }


}