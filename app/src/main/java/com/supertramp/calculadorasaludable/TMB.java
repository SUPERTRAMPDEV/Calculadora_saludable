package com.supertramp.calculadorasaludable;

public abstract class TMB {
    protected int peso;
    protected int altura;
    protected int edad;

    public TMB(int peso, int altura, int edad){
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;

    }

    public float simpleTMB(){
        return Float.parseFloat(String.valueOf((10*peso) + (6.25*altura) - (5*edad)));

    }


}
