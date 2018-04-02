package com.supertramp.calculadorasaludable;

public class IMC {
    private int peso;
    private int altura;

    public IMC(int peso, int altura){
        this.peso = peso;
        this.altura = altura;
    }

    public int imc(){
     int result = (int) (this.peso / (Math.pow((this.altura/100),2)));
     return result;
    }

}
