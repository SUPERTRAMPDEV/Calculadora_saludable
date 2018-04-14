package com.supertramp.calculadorasaludable;

import android.content.Context;

public class TMB {
    protected Context context;
    protected int peso;
    protected int altura;
    protected int edad;
    protected String af;

    public TMB(Context context,int peso, int altura, int edad,String af){
        this.context = context;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.af = af;
    }

    public int simpleTMB(){
        float r = Float.parseFloat(String.valueOf((10*peso) + (6.25*altura) - (5*edad)));

        return  Math.round(r);
    }


}
