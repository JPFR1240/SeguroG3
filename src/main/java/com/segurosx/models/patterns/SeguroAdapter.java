package com.segurosx.models.patterns;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.segurosx.models.IExportableArray;
import com.segurosx.models.Seguro;

public class SeguroAdapter implements IExportableArray {

    private Seguro seguro;
    private String ruta = "C:/xampp/htdocs/Labos de Patrones/Jean Piero/SeguroG3/src/assets/prueba.csv";

    public SeguroAdapter(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public ArrayList<String> aArrayFromCsv() {

        this.crearArchivoCsv();

        CSVReader csvReader;
        try {
            csvReader = new CSVReader(new FileReader(this.ruta));
            String[] fila;

            ArrayList<String> as = new ArrayList<>();
            int i = 0;

            while ((fila = csvReader.readNext()) != null) {
                as.add(fila[0]);
                as.add(fila[1]);
                // as.add(fila[2]);
                // as.add(fila[3]);
                // cont++;
            }
            csvReader.close();

            return as;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;
    }

    public void crearArchivoCsv() {

        // String [] datos = {seguro.getNumero().toString() ,
        // this.seguro.getNivelRiesgo(),
        // this.seguro.getCertificado().getNumero().toString(),
        // this.seguro.getPoliza().getNumero().toString()};

        // String [] datos = {this.seguro.getNumero().toString() ,
        // seguro.getNivelRiesgo(), this.seguro.getCertificado().getNumero().toString(),
        // this.seguro.getPoliza().getNumero().toString()};

        String[] datos = { Integer.toString(this.seguro.getNumero()), this.seguro.getNivelRiesgo() };

        // String [] datos = {seguro.getDetalleSeguro()};

        // send.add(super);
        // send.add(this.seguro.getNivelRiesgo());
        // send.add(this.seguro.getCertificado());
        // send.add(this.seguro.getPoliza());
        // send.add(this.seguro.getDetalleSeguro());

        CSVWriter writer;
        try {
            writer = new CSVWriter(new FileWriter(this.ruta));
            writer.writeNext(datos);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

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

}