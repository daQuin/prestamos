/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDTO;

import FACTORY.DaoFactory;
import Interfaz.Ielemento;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Administrador {
    
    private String user_name;
    private String correo;
    private String pasword;

    private FACTORY.DaoFactory factor;

    
    public Administrador() {
         factor = new DaoFactory();
    }

    public Administrador(String user_name, String correo, String pasword) {
        this.user_name = user_name;
        this.correo = correo;
        this.pasword = pasword;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    
       public boolean registrarElemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio) {
           Ielemento a = factor.obtenerConexionElemento(false);
        Elemento aux = new Elemento(id, nombre, valor, cantidad, descripcion, id_espacio);
        return a.registrarelemento(aux);
    }
    
        public boolean actualizarElemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio)  {
        Ielemento a = factor.obtenerConexionElemento(false);
        return a.actualizarelemento(id, nombre, valor, cantidad, descripcion, id_espacio);
    }

    public boolean eliminarElemento(int id) {
        Ielemento a = factor.obtenerConexionElemento(false);
        return a.eliminarElemento(id);
    }

    public Elemento consultarElemento(int id) {
        Ielemento a = factor.obtenerConexionElemento(false);
        return a.consultar(id);
    }
        
    public ArrayList<Elemento> listarElementos() {
         Ielemento a = factor.obtenerConexionElemento(false);
        return a.listarelementos();
    }

       
    
    
}
