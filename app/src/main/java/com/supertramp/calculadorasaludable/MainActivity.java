package com.supertramp.calculadorasaludable;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Button registros_anteriores,ok;
   private EditText etnombre, etedad,etpeso,etaltura;
   private RadioGroup radioGroupsexo, radioGroupAf;
   private RadioButton sr,afr;
   private String nombre,edad,peso,altura,sexo,af;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registros_anteriores = (Button) findViewById(R.id.registros_anteriores);
        ok = (Button) findViewById(R.id.boton);
        etnombre = (EditText) findViewById(R.id.et_nombre);
        etedad = (EditText) findViewById(R.id.et_edad);
        etpeso = (EditText) findViewById(R.id.et_peso);
        etaltura = (EditText) findViewById(R.id.et_altura);
        radioGroupsexo = (RadioGroup) findViewById(R.id.radiogroupsex);
        radioGroupAf = (RadioGroup) findViewById(R.id.radiogroupaf);


        SharedPreferences preferences = getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String datos_existes = preferences.getString("datos_existentes", null);

        if(datos_existes == null){
            registros_anteriores.setVisibility(View.GONE);
        }



        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sr = (RadioButton) findViewById(radioGroupsexo.getCheckedRadioButtonId());
                afr = (RadioButton) findViewById(radioGroupAf.getCheckedRadioButtonId());
                nombre = etnombre.getText().toString();
                edad = etedad.getText().toString();
                peso = etpeso.getText().toString();
                altura = etaltura.getText().toString();
                sexo = sr.getText().toString();
                af = afr.getText().toString();

                


            }
        });


    }
}
