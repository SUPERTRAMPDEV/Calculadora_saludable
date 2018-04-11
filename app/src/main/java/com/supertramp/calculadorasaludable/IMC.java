package com.supertramp.calculadorasaludable;

public class IMC {
    //codigo mal!!
    private float peso;
    private float altura;

    public IMC(float peso,float altura){
        this.peso = peso;
        this.altura = altura;
    }

    public int imc(){
     int result = (int) (this.peso / (Math.pow((this.altura/100),2)));
     return result;
    }

}
