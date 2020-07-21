package com.segurosx.models.patterns;

import java.io.FileWriter;
import java.io.IOException;

import com.segurosx.models.IExportable;
import com.segurosx.models.IExportablejson;
import com.segurosx.models.Poliza;

import org.json.JSONObject;

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

        // StringBuffer json = new StringBuffer();
        // json.append("envio:{\n");
        // json.append("title:Formato XML"+ ",\n");
        // json.append("poliza:{\n");
        // json.append("numero: " + this.poliza.getNumero()+ ",\n");
        // json.append("nombresAsegurado: " + this.poliza.getNombresAsegurado() + ",\n");
        // json.append("nombresTomador: " + this.poliza.getNombresTomador() + ",\n");
        // json.append(" }\n");
        // json.append("}\n");

        // return json.toString();

        JSONObject obj = new JSONObject();

        // jo.put("envio");
        // jo.put("poliza");
        // json2.put("envio");
        obj.put("numero", this.poliza.getNumero());
        obj.put("nombresAsegurado: " , this.poliza.getNombresAsegurado());
        obj.put("nombresAsegurado: " , this.poliza.getNombresAsegurado());

        // jo.put(json2);
        try {
            
            FileWriter file = new FileWriter("C:/xampp/htdocs/Labos de Patrones/Jean Piero/SeguroG3/src/assets/prueba.csv");
			file.write(obj.toString());
			file.flush();
			file.close();

		} catch (IOException e) {
			//manejar error
        }
        return obj.toString();
    }
}