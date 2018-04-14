package com.supertramp.calculadorasaludable;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.Resources;

public class TMB_H extends TMB {
    public TMB_H(Context context,int peso, int altura, int edad, String af) {
        super(context,peso, altura, edad,af);
    }

    public int TMB_H(){
       float tmp = simpleTMB()+5;
       if(af.equals(context.getResources().getString(R.string.rb_baja))){
            tmp =  Float.parseFloat(String.valueOf(tmp*1.2));
        }else if(af.equals(context.getResources().getString(R.string.rb_equilibrada))){
           tmp = Float.parseFloat(String.valueOf(tmp* 1.55));
       }else if(af.equals(context.getResources().getString(R.string.rb_alta))){
           tmp = Float.parseFloat(String.valueOf(tmp* 1.725));

       }

        return  Integer.parseInt(String.valueOf(tmp));


    }



}
