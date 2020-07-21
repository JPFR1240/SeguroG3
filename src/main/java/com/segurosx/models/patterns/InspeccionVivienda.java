package com.segurosx.models.patterns;

import com.segurosx.models.Iinspeccion;

public class InspeccionVivienda extends InspeccionDecorator {
    
    public InspeccionVivienda(Iinspeccion inspeccion){
        super(inspeccion);
    }

    @Override
    public void generarInspeccion() {
        // TODO Auto-generated method stub
        super.generarInspeccion();
        agregarinspeccionVivienda();

    }

    public void agregarinspeccionVivienda(){
        System.out.println( " : inspeccion de Vivienda");
    }

}