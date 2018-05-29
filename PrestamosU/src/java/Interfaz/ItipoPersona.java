/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.TipoPersona;

/**
 *
 * @author Juan
 */
public interface ItipoPersona {
    public boolean registrartipopersona(TipoPersona tp);
    public boolean eliminartipopersona(String tipoPersona);
    public boolean eliminarconsultar(String tipoPersona);
    public boolean actualizartipopersona(String tipoPersona, String descripcion);
    public ArrayList<TipoPersona>listartipoPersona();
}
