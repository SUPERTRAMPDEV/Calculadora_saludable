package com.supertramp.calculadorasaludable;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button registros_anteriores,ok;
    EditText etnombre, etedad,etpeso,altura;
    Rad

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registros_anteriores = (Button) findViewById(R.id.registros_anteriores);

        SharedPreferences preferences = getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String datos_existes = preferences.getString("datos_existentes", null);

        if(datos_existes == null){
            registros_anteriores.setVisibility(View.GONE);
        }


    }
}
