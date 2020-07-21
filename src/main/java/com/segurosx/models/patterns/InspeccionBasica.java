package com.segurosx.models.patterns;

import com.segurosx.models.Iinspeccion;


public class InspeccionBasica implements Iinspeccion{
    
    @Override
    public void generarInspeccion(){
        System.out.println("inspeccion basica con :");
        inspeccionventa();
    }

    private void inspeccionventa(){
        System.out.println("inspecciones ");
    }
    
}