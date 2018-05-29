/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.Dependencia;

/**
 *
 * @author Juan
 */
public interface Idependencia {
    public boolean registrardependencia(Dependencia d);
    public boolean actualizardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion);
    public Dependencia consultardependencia(int id_dependencia);
    public boolean eliminardependencia(int id_dependencia);
    public ArrayList<Dependencia> listardependencia();
}
