package com.segurosx.models.patterns;

import com.segurosx.models.Iinspeccion;

public class InspeccionJudicial extends InspeccionDecorator {
    
    public InspeccionJudicial(Iinspeccion inspeccion){
        super(inspeccion);
    }

    @Override
    public void generarInspeccion() {
        // TODO Auto-generated method stub
        super.generarInspeccion();
        agregarinspeccionJudicial();

    }

    public void agregarinspeccionJudicial(){
        System.out.println( " : inspeccion Judicial");
    }

}