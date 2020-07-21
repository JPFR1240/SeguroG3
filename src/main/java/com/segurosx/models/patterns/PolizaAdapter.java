package com.segurosx.models.patterns;

import com.segurosx.models.IExportable;
import com.segurosx.models.IExportablejson;
import com.segurosx.models.Poliza;

public class PolizaAdapter implements IExportable,IExportablejson {
    
    private Poliza poliza;

    public PolizaAdapter(Poliza poliza)  {
        this.poliza = poliza;
    }

    @Override
    public String aXML() {
        
        StringBuffer xml = new StringBuffer();
        xml.append("<envio>");
        xml.append("<title>Formato XML</title>");
        xml.append("<poliza>");
        xml.append("<numero>" + this.poliza.getNumero() + "</numero>");
        xml.append("<nombresAsegurado>" + this.poliza.getNombresAsegurado() + "</nombresAsegurado>");
        xml.append("<nombresTomador>" + this.poliza.getNombresTomador() + "</nombresTomador>");
        xml.append("</poliza>");
        xml.append("</envio>");

        return xml.toString();
    }

    @Override
    public String aTexto() {
        
        return this.poliza.armarSalidaTexto();
    }

    @Override
    public String aJSON() {
        // TODO Auto-generated method stub
        StringBuffer json = new StringBuffer();
        json.append("envio:{\n");
        json.append("title:Formato XML"+ ",\n");
        json.append("poliza:{\n");
        json.append("numero: " + this.poliza.getNumero()+ ",\n");
        json.append("nombresAsegurado: " + this.poliza.getNombresAsegurado() + ",\n");
        json.append("nombresTomador: " + this.poliza.getNombresTomador() + ",\n");
        json.append(" }\n");
        json.append("}\n");

        return json.toString();
    }
}