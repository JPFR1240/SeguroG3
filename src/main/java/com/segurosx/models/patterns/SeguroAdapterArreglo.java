package com.segurosx.models.patterns;

import java.util.ArrayList;

import com.segurosx.models.Seguro;

public class SeguroAdapterArreglo extends SeguroAdapter {

    public SeguroAdapterArreglo(Seguro seguro) {
        super(seguro);
    }

    @Override
    public ArrayList<String> aArray() {

        ArrayList<Object> send = new ArrayList<>();

        // send.add(super);
        // send.add(this.seguro.getCertificado());
        // send.add(this.seguro.getNivelRiesgo());
        // send.add(this.seguro.getPoliza());
        // send.add(this.seguro.getDetalleSeguro());

        ArrayList<String> sendString = new ArrayList<>();

        for( Object o : send ){
            sendString.add(String.valueOf(o));
        }

        return sendString;
    }

    
    
}