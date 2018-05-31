/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.Administrador;

/**
 *
 * @author Juan
 */
public interface Iadministrador {
    public boolean registraradministrador(Administrador a);
    public boolean actualizaradministrador(String user_name, String correo, String pasword);
    public Administrador consultaradministrador(String user_name);
    public boolean eliminaradministrador(String user_name);
    public ArrayList<Administrador>listarstradoradmin();

}
