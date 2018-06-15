/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import negocio.Negocio;
import prestamoDTO.Persona;
import prestamoDTO.TipoPersona;

/**
 *
 * @author DELL
 */
public class prueba {
    
    public static void main(String[] args) {
        
        Negocio n = new Negocio();
        
        TipoPersona tp = new TipoPersona();
        tp = n.consultartipopersona("1");
        
        Persona p = new Persona("1112", "Adonai", "Quintero", "123123", "1sasa", tp, "asdsad");
        
        n.registrarPersona(p);
        
        
    }
    
}
