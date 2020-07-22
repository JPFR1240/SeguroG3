package com.segurosx.models.patterns;

import com.segurosx.models.FormaPagoDebidoAutomatico;
import com.segurosx.models.IFormaPagoDebitoAutomatico;

public class PagoDebitoAutomaticoFactory {
    
    public static IFormaPagoDebitoAutomatico getFormaPago(String tipo){
        if(tipo.equals("Pago Debito")){
            return new FormaPagoDebidoAutomatico();
        }else{
            return null;
        }
    }

}