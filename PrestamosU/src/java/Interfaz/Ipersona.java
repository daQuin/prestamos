/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.Persona;
import prestamoDTO.TipoPersona;

/**
 *
 * @author DELL
 */
public interface Ipersona {
  public boolean registrarPersona(Persona p);
  public boolean eliminarPersona(String c);
  public boolean actualizarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword);
  public Persona consultarPersona(String c);  
  public ArrayList<Persona> listarPersona();
}
