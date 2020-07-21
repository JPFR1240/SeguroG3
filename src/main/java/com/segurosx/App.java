package com.segurosx;

import com.segurosx.models.Cliente;
import com.segurosx.models.IExportable;
import com.segurosx.models.IExportablejson;
import com.segurosx.models.Poliza;
import com.segurosx.models.SeguroTarjeta;
import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.VentaSeguro;
import com.segurosx.models.patterns.PolizaAdapter;
//import com.segurosx.models.patterns.PolizaAdapter2;
import com.segurosx.models.patterns.PolizaAdapter2;
import com.segurosx.models.patterns.PolizaAdapterjson;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Cliente cliente = new Cliente("Juan Perez");
        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.calcularRiesgo();

        //Pregunta 4
        seguro.calcularCobeturaVehicular();
        
        cliente.setCompraSeguro(seguro);
        System.out.println( seguro.getDetalleSeguro() );


        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.calcularRiesgo();
        
        //Pregunta 4
        seguro2.calculaCoberturaTarjeta();
        seguro2.setPoliza(new Poliza(122122, "Juan Pablo", "Juan Perez"));        
        cliente.setCompraSeguro(seguro2);
        System.out.println( seguro2.getDetalleSeguro() );

        System.out.println();
        seguro2.getPoliza().imprimir();
         
        IExportable exportable = new PolizaAdapter(seguro2.getPoliza());
        System.out.println( exportable.aXML() +"\n");

        IExportable exportable2 = new PolizaAdapter2(76656, "Juan Perez", "Juan Pablo");
        System.out.println( exportable2.aXML() +"\n");
        
        //PREGUNTA  1
        System.out.println("\n----------inspeccionar Cliente-----------------");        
        VentaSeguro newventa=new VentaSeguro(); //?
        newventa.InspeccionTotal();
        /** |abierto-cerrado| ya que motiva el uso de extensiones de codigo y  de funcionalidad y no para cambiar codigo fuente,
         *  |inversion de dependencias| en el caso de el componenteDecorador depende de una clase absracta y no de una concreta
         *  |unica responsabilidad| a apartir de una clase simple podemos agregar responsabilidades y que pueda ser incremental, evitando clases complejas.
         */


        //PREGUNTA 4
        /**una forma  █*/
        System.out.println("\n----------a JSON-----------------");      
        IExportablejson exportable3 = new PolizaAdapter(seguro2.getPoliza());
        System.out.println( exportable3.aJSON() +"\n");



        

        /**dos forma NO SIRVE*/
        /*System.out.println("\n----------a JSON 2-----------------");
        IExportable exportable4 = new PolizaAdapterjson(76656, "Juan Perez", "Juan Pablo");
        System.out.println( exportable4.JSON() +"\n");*/
    } 
}




