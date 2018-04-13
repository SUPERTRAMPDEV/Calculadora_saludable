package com.supertramp.calculadorasaludable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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

        IMC imc = new IMC(Float.parseFloat(peso), Float.parseFloat(altura));




    }
}
