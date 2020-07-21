package com.segurosx.models;

import java.util.Scanner;

import com.segurosx.models.patterns.CoberturaBasicaTarjeta;
import com.segurosx.models.patterns.CoberturaBasicaVehicular;
import com.segurosx.models.patterns.CoberturaPorChoqueDecorator;
import com.segurosx.models.patterns.CoberturaPorRoboDecorator;
import com.segurosx.models.patterns.CoberturaTodoRiesgoDecorator;

public class SeguroTarjeta extends Seguro implements INivelRiesgo {
    private ICobertura cobertura;

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void calcularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro() {
        
        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void calculaCoberturaTarjeta() {
        
        Scanner valor = new Scanner(System.in);

        System.out.println("Elija el tipo de cobertura que prefiere:");
        System.out.println("1. Cobertura básico");
        System.out.println("2. Cobertura básica y por robo");
        System.out.println("3. Cobertura total");

        Integer cb = valor.nextInt();
        switch (cb) {
            case 1:
                this.cobertura = new CoberturaBasicaTarjeta();
                break;
            case 2:
                this.cobertura = new CoberturaPorRoboDecorator(new CoberturaBasicaTarjeta());
                break;
            case 3:
                this.cobertura = new CoberturaTodoRiesgoDecorator(new CoberturaPorRoboDecorator(new CoberturaBasicaTarjeta()));
                break;
            default:
                break;
        }
        System.out.println("Ha elegido la cobertura tipo" + cb);
        cobertura.calculaCobertura();
    }
}