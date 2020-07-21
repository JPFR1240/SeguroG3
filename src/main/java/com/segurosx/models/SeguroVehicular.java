package com.segurosx.models;

import java.util.Scanner;

import com.segurosx.models.patterns.CoberturaBasicaVehicular;
import com.segurosx.models.patterns.CoberturaPorChoqueDecorator;
import com.segurosx.models.patterns.CoberturaPorRoboDecorator;
import com.segurosx.models.patterns.CoberturaTodoRiesgoDecorator;

public class SeguroVehicular extends Seguro implements INivelRiesgo {

    private ICobertura cobertura;
    
    public SeguroVehicular(String marca, String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;

    }

    @Override
    public void calcularRiesgo() {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 

    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void calcularCobeturaVehicular() {

        Scanner valor = new Scanner(System.in);

        System.out.println("Elija el tipo de cobertura que prefiere:");
        System.out.println("1. Cobertura básico");
        System.out.println("2. Cobertura básica y por choque");
        System.out.println("3. Cobertura básica y por robo");
        System.out.println("4. Cobertura total");

        Integer cb = valor.nextInt();
        switch (cb) {
            case 1:
                this.cobertura = new CoberturaBasicaVehicular();
                break;
            case 2:
                this.cobertura = new CoberturaPorChoqueDecorator(new CoberturaBasicaVehicular());
                break;
            case 3:
                this.cobertura = new CoberturaPorRoboDecorator(new CoberturaBasicaVehicular());
                break;
            case 4:
                this.cobertura = new CoberturaTodoRiesgoDecorator(
                        new CoberturaPorChoqueDecorator(new CoberturaBasicaVehicular()));
                break;
            default:
                break;
        }
        System.out.println("Ha elegido la cobertura tipo" + cb);
        cobertura.calculaCobertura();     
    }
}