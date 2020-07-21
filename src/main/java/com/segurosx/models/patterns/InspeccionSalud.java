package com.segurosx.models.patterns;

import com.segurosx.models.Iinspeccion;

public class InspeccionSalud extends InspeccionDecorator {
    
    public InspeccionSalud(Iinspeccion inspeccion){
        super(inspeccion);
    }

    @Override
    public void generarInspeccion() {
        // TODO Auto-generated method stub
        super.generarInspeccion();
        agregarinspeccionSalud();

    }

    public void agregarinspeccionSalud(){
        System.out.println( " : inspeccion de Salud");
    }

}