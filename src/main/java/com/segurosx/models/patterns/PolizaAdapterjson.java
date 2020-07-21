package com.segurosx.models.patterns;


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
        StringBuffer json = new StringBuffer();
        json.append("envio:{\n");
        json.append("title:Formato XML"+ ",\n");
        json.append("poliza:{\n");
        json.append("numero: " + super.getNumero()+ ",\n");
        json.append("nombresAsegurado: " + super.getNombresAsegurado() + ",\n");
        json.append("nombresTomador: " + super.getNombresTomador() + ",\n");
        json.append(" }\n");
        json.append("}\n");

        return json.toString();
    }
}