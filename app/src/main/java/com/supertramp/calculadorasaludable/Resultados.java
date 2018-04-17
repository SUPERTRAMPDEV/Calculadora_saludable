package com.supertramp.calculadorasaludable;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Resultados extends AppCompatActivity {

    private String nombre,edad,peso,altura,sexo,af;
    private TextView tvimctit,tvimcrecomendaciones;
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
        tvimctit = (TextView) findViewById(R.id.imcresult);
        tvimcrecomendaciones = (TextView) findViewById(R.id.recomendacion_imc);

        IMC imc = new IMC(Float.parseFloat(peso),Float.parseFloat(altura));


        if(sexo.equals(getResources().getString(R.string.rb_hombre))){
            TMB_H tmb_h = new TMB_H(getApplicationContext(),Integer.parseInt(peso), Integer.parseInt(altura) , Integer.parseInt(edad), af);

        }else{
            TMB_M tmb_m = new TMB_M(getApplicationContext(),Integer.parseInt(peso), Integer.parseInt(altura) , Integer.parseInt(edad), af);

        }

       tvimctit.setText(String.valueOf(imc.imc()));


        if(imc.imc()<18){
            tvimcrecomendaciones.setText(nombre + " " +   getResources().getString(R.string.tvrecomendacionimc1) +  " "  + peso + " kg)");

        }else if(imc.imc()>=18 && imc.imc() <25){
            tvimcrecomendaciones.setText(nombre +  " " + getResources().getString(R.string.tvrecomendacionimc2) +  " "  + peso + " kg)");

        }else if(imc.imc()>=25 && imc.imc() <27){
        tvimcrecomendaciones.setText(nombre +   " " +getResources().getString(R.string.tvrecomendacionimc3) +  " "  + peso + " kg)");

         }else if(imc.imc() == 27){
            tvimcrecomendaciones.setText(nombre +  " " + getResources().getString(R.string.tvrecomendacionimc4) +  " "  + peso + " kg)");

        }else if(imc.imc()>27 && imc.imc() < 30){
            tvimcrecomendaciones.setText(nombre +  " " + getResources().getString(R.string.tvrecomendacionimc5) +  " "  + peso + " kg)");

        }else if(imc.imc()>=30 && imc.imc() < 40){
            tvimcrecomendaciones.setText(nombre + " " +  getResources().getString(R.string.tvrecomendacionimc6) +  " "  + peso + " kg)");

        }else{
            tvimcrecomendaciones.setText(nombre + " " +  getResources().getString(R.string.tvrecomendacionimc7)+  " "  + peso + " kg)");

        }


    }
}
