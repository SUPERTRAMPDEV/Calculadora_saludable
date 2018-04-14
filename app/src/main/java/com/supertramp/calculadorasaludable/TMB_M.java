package com.supertramp.calculadorasaludable;

import android.content.Context;

public class TMB_M extends TMB{

    public TMB_M(Context context,int peso, int altura, int edad, String af) {
        super(context,peso, altura, edad,af);
    }

    public int TMB_M(){
        float tmp = simpleTMB()-161;

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
