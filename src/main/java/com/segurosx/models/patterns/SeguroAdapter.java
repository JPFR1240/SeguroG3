package com.segurosx.models.patterns;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.segurosx.models.IExportableArray;
import com.segurosx.models.Seguro;
import com.segurosx.models.SeguroVehicular;

public class SeguroAdapter implements IExportableArray {

    private Seguro seguro;
    private String ruta = "C:/xampp/htdocs/Labos de Patrones/Jean Piero/SeguroG3/src/assets/prueba.csv";
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
    public ArrayList<String> aArrayFromCsv(SeguroVehicular seguro) {

        this.crearArchivoCsv(seguro);

        CSVReader csvReader;
        try {
            csvReader = new CSVReader(new FileReader(this.ruta));
            String[] fila ;

            ArrayList<String> as = new ArrayList<>();

            while ((fila = csvReader.readNext()) != null) {
                // if(cont == 2){
                    as.add(fila[0]);
                    as.add(fila[1]);
                    as.add(fila[2]);
                    as.add(fila[3]);
                    System.out.println(as);
                // }
                // System.out.println(fila[0] + " | " + fila[1] );
                // cont++;
            }
            csvReader.close();

            return as;
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return null;
    }

    public void crearArchivoCsv(SeguroVehicular seguro){
        
        String [] datos = {seguro.getNumero().toString() , this.seguro.getNivelRiesgo(), this.seguro.getCertificado().getNumero().toString(), this.seguro.getPoliza().getNumero().toString()};

        // String [] datos = {Integer.toString(seguro.getNumero()), seguro.getNivelRiesgo()};

        // String [] datos = {seguro.getDetalleSeguro()};

        // send.add(super);
        // send.add(this.seguro.getCertificado());
        // send.add(this.seguro.getNivelRiesgo());
        // send.add(this.seguro.getPoliza());
        // send.add(this.seguro.getDetalleSeguro());

        CSVWriter writer;
        try {
            writer = new CSVWriter(new FileWriter(this.ruta));
            writer.writeNext(datos);
    
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    
}