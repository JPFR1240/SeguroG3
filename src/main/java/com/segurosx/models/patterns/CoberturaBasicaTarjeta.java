package com.segurosx.models.patterns;

import com.segurosx.models.ICobertura;

public class CoberturaBasicaTarjeta implements ICobertura{
    @Override
    public void calculaCobertura() {
        // TODO Auto-generated method stub
            System.out.println("El seguro de tarjeta cubre:");
            agregarDanosTarjeta();
    }
    public void agregarDanosTarjeta(){
        System.out.println("Daños a la tarjeta");
    }
}