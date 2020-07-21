package com.segurosx.models.patterns;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class PolizaAdapterjson extends PolizaAdapter2 {

    public PolizaAdapterjson(Integer numero, String nombresAsegurado, String nombresTomador) {
        super(numero, nombresAsegurado, nombresTomador);
        // TODO Auto-generated constructor stub
    }
    public String aXML() {
        return super.aXML();
    }
    public String aTexto() {
        return super.aTexto();
    }
    public String aJSON() {
        // TODO Auto-generated method stub
        // StringBuffer json = new StringBuffer();
        // json.append("envio:{\n");
        // json.append("title:Formato XML"+ ",\n");
        // json.append("poliza:{\n");
        // json.append("numero: " + super.getNumero()+ ",\n");
        // json.append("nombresAsegurado: " + super.getNombresAsegurado() + ",\n");
        // json.append("nombresTomador: " + super.getNombresTomador() + ",\n");
        // json.append(" }\n");
        // json.append("}\n");

        // return json.toString();

        JSONObject obj = new JSONObject();

        // jo.put("envio");
        // jo.put("poliza");
        // json2.put("envio");
        obj.put("numero", super.getNumero());
        obj.put("nombresAsegurado: " , super.getNombresAsegurado());
        obj.put("nombresAsegurado: " , super.getNombresAsegurado());

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