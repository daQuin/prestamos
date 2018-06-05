/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import java.util.Date;
import prestamoDTO.Administrador;
import prestamoDTO.Dependencia;
import prestamoDTO.Elemento;
import prestamoDTO.Espacio;
import prestamoDTO.Evento;
import prestamoDTO.Persona;
import prestamoDTO.Solicitud;
import prestamoDTO.TipoPersona;

/**
 *
 * @author DELL
 */
public interface Inegocio {
    
    public boolean registrarelemento(Elemento e);
    public boolean actualizarelemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio);
    public Elemento consultar(int id);
    public boolean eliminarElemento(int id);
    public ArrayList<Elemento>listarelementos();
    
    public boolean registrarespacio(Espacio e);
    public Espacio consultarespacio(int id_espacios);
    public boolean eliminarespacio(int id_espacios);
    public boolean actualizarespacio(int idSpacios, String mombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia);
    public ArrayList<Espacio> listarespacios();
    
    public boolean registraradministrador(Administrador a);
    public boolean actualizaradministrador(String user_name, String correo, String pasword);
    public Administrador consultaradministrador(String user_name);
    public boolean eliminaradministrador(String user_name);
    public ArrayList<Administrador>listarstradoradmin();
    
    public boolean registrardependencia(Dependencia d);
    public boolean actualizardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion);
    public Dependencia consultardependencia(int id_dependencia);
    public boolean eliminardependencia(int id_dependencia);
    public ArrayList<Dependencia> listardependencia();
    
    public boolean registrarevento(Evento e);
    public boolean actualizarevento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler);
    public Evento consultarevento(int id_evento);
    public boolean eliminarevento(int id_evento);
    public ArrayList<Evento> listarevento();
    
    public boolean registrarPersona(Persona p);
    public boolean eliminarPersona(String c);
    public boolean actualizarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword);
    public Persona consultarPersona(String c);  
    public ArrayList<Persona> listarPersona();
    
    
    public boolean registrarsolicitud(Solicitud s);
    public boolean actualizarsolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud);
    public Solicitud consultarsolicitud(int id_solicitud);
    public boolean eliminarsolicitud(int id_solicitud);
    public ArrayList<Solicitud> listarsolicitud();
    
    public boolean registrartipopersona(TipoPersona tp);
    public boolean eliminartipopersona(String tipoPersona);
    public TipoPersona consultartipopersona(String tipoPersona);
    public boolean actualizartipopersona(String tipoPersona, String descripcion);
    public ArrayList<TipoPersona>listartipoPersona();

}
