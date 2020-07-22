package com.segurosx.models.patterns;

import com.segurosx.models.CuponPago;
import com.segurosx.models.FormaPagoCuponPago;
import com.segurosx.models.IFormaPagoCupon;

public class PagoCuponPagoFactory {
    
public static IFormaPagoCupon getFormaPago(String tipo){
    if(tipo.equals("Cupon")){
        return new CuponPago();
    }else if(tipo.equals("Forma Pago Cupon")){
        return new FormaPagoCuponPago();
    }else{
        return null;
    }
}

}