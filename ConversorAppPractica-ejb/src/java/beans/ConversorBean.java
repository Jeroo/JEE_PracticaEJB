/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author scuev
 */
@Singleton
@LocalBean
public class ConversorBean {
    
    private static double cambio = 1.1;

    public double dolaresAeuros(double cantidad) {
        
        double resultado = cantidad / cambio;
        
        return resultado;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public double eurosAdolares(double cantidad) {
        
        double resultado = cantidad * cambio;
        
        return resultado;
    }
}
