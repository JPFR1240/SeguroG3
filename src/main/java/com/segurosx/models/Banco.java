package com.segurosx.models;

import java.util.ArrayList;

public class Banco {

    private ArrayList<String> infoSeguro;

    // public void obtenerDetalleSeguro(ArrayList<String> arr){
    //     System.out.println(arr);
    // }

    public void obtnerDetalleSeguroFromCsv(ArrayList<String> as){
        this.infoSeguro = as;
    }

    public ArrayList<String> getInfoSeguro() {
        return infoSeguro;
    }
    
}