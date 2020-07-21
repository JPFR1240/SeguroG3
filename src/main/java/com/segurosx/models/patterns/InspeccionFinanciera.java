package com.segurosx.models.patterns;

import com.segurosx.models.Iinspeccion;

public class InspeccionFinanciera extends InspeccionDecorator {
    
    public InspeccionFinanciera(Iinspeccion inspeccion){
        super(inspeccion);
    }

    @Override
    public void generarInspeccion() {
        // TODO Auto-generated method stub
        super.generarInspeccion();
        agregarinspeccionFinanciera();

    }

    public void agregarinspeccionFinanciera(){
        System.out.println( " : inspeccion Financiera");
    }

}