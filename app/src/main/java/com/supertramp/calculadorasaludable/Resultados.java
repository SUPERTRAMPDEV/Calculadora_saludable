package com.supertramp.calculadorasaludable;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;


public class Resultados extends AppCompatActivity {

    private String nombre,edad,peso,altura,sexo,af;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Bundle parametros = getIntent().getExtras();
        nombre = parametros.getString("nombre");
        edad = parametros.getString("edad");
        peso = parametros.getString("peso");
        altura = parametros.getString("altura");
        sexo = parametros.getString("sexo");
        af = parametros.getString("af");


        IMC imc = new IMC(Float.parseFloat(peso),Float.parseFloat(altura));
        if(sexo.equals(getResources().getString(R.string.rb_hombre))){
            TMB_H tmb_h = new TMB_H(getApplicationContext(),Integer.parseInt(peso), Integer.parseInt(altura) , Integer.parseInt(edad), af);

        }else{
            TMB_M tmb_m = new TMB_M(getApplicationContext(),Integer.parseInt(peso), Integer.parseInt(altura) , Integer.parseInt(edad), af);


        }



    }
}
