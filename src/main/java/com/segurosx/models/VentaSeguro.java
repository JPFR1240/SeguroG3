package com.segurosx.models;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.segurosx.models.patterns.InspeccionBasica;
import com.segurosx.models.patterns.InspeccionFinanciera;
import com.segurosx.models.patterns.InspeccionJudicial;
import com.segurosx.models.patterns.InspeccionSalud;
import com.segurosx.models.patterns.InspeccionVivienda;

public class VentaSeguro {
    Iinspeccion inspeccion;

    public  VentaSeguro(){};

    public  void InspeccionTotal(){
        this.inspeccion = new InspeccionJudicial(new InspeccionSalud(new InspeccionVivienda(new InspeccionBasica())));
        inspeccion.generarInspeccion();
    }

    public void InspeccionFinanciera(){
        this.inspeccion = new InspeccionFinanciera(new InspeccionBasica());
        inspeccion.generarInspeccion();
    }
    public  void InspeccionSaludVivienda(){
        this.inspeccion = new InspeccionSalud(new InspeccionVivienda(new InspeccionBasica()));
        inspeccion.generarInspeccion();
    }

}