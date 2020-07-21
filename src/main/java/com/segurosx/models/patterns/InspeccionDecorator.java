package com.segurosx.models.patterns;


import com.segurosx.models.Iinspeccion;

public class InspeccionDecorator implements Iinspeccion{

    public final Iinspeccion inspeccion;

    public InspeccionDecorator(Iinspeccion inspeccion) {
        this.inspeccion=inspeccion;
    }

    @Override
    public void generarInspeccion(){
        this.inspeccion.generarInspeccion();
    }

}