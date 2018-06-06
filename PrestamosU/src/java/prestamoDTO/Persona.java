/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDTO;

import FACTORY.DaoFactory;
import Interfaz.Iespacio;
import Interfaz.Ipersona;
import Interfaz.Isolicitud;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private TipoPersona tipopersona;
    private String pasword;
     
    FACTORY.DaoFactory factorp;
    public Persona() {
        factorp=new DaoFactory();
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.tipopersona = tipopersona;
        this.pasword = pasword;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TipoPersona getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(TipoPersona tipopersona) {
        this.tipopersona = tipopersona;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    public boolean registrarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword){
        Ipersona a=factorp.obtenerConexionPersona(false);
        Persona p=new Persona(cedula, nombre, apellido, telefono, correo, tipopersona, pasword);
        return a.registrarPersona(p);
    }
    public boolean actualizarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword){
        Ipersona a=factorp.obtenerConexionPersona(false);
        return a.actualizarPersona(cedula, nombre, apellido, telefono, correo, tipopersona, pasword);
    }
    
    public boolean solicitarEspacio(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud){
        Isolicitud a=factorp.obtenerConexionSolicitud(false);
        Solicitud s=new Solicitud(nombre, descripcion, fecha, hora, duracion, estado, espacio, cedula_Persona, id_solicitud);
        return a.registrarsolicitud(s);
    }
    
    public boolean actualizarSolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud){
        Isolicitud a=factorp.obtenerConexionSolicitud(false);
        return a.actualizarsolicitud(nombre, descripcion, fecha, hora, duracion, estado, espacio, cedula_Persona, id_solicitud);
    }
    public boolean eliminarSolicitud(int id){
        Isolicitud a=factorp.obtenerConexionSolicitud(false);
        return a.eliminarsolicitud(id);
    }
}
