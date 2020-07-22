package com.segurosx.models;

import java.util.ArrayList;

import com.segurosx.models.patterns.SeguroAdapter;

public class Banco {

    private ArrayList<String> infoSeguro;

    // public void obtenerDetalleSeguro(ArrayList<String> arr){
    //     System.out.println(arr);
    // }

    public void obtnerDetalleSeguroFromCsv(SeguroVehicular seguro){
        IExportableArray exportable4 = new SeguroAdapter(seguro);
        
        System.out.println("DEVOLVIENDO EL ARRAY");
        this.infoSeguro = exportable4.aArrayFromCsv(seguro);
        System.out.println(imprimir(this.infoSeguro));
    }

    public String imprimir(ArrayList<String> as) {
        return as.toString();
    }

    public ArrayList<String> getInfoSeguro() {
        return infoSeguro;
    }
    
}