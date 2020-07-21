package com.segurosx.models.patterns;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.segurosx.models.IExportableArray;
import com.segurosx.models.Seguro;

public class SeguroAdapter implements IExportableArray {

    private Seguro seguro;

    public SeguroAdapter(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public ArrayList<String> aArray() {

        ArrayList<String> send = new ArrayList<>();

        System.out.println(this.seguro.getDetalleSeguro());

        // send.add(Integer.toString(this.seguro.getNumero()));
        // send.add(this.seguro.getNivelRiesgo());
        // send.add(Integer.toString(this.seguro.getCertificado().getNumero()));
        // send.add(this.seguro.getPoliza().toString());
        send.add(this.seguro.getDetalleSeguro());

        return send;
    }

    @Override
    public ArrayList<String> aArrayFromCsv(String ruta) {

        CSVReader csvReader;
        try {
            csvReader = new CSVReader(new FileReader(ruta));
            
            String[] fila ;
            int cont =1;

            while ((fila = csvReader.readNext()) != null) {
                ArrayList<String> as = new ArrayList<>();
                if(cont == 2){
                    as.add(fila[0]);
                    as.add(fila[1]);
                    System.out.println(as);
                }
                // System.out.println(fila[0] + " | " + fila[1] );
                cont++;
            }
            csvReader.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        return null;
    }



    
}