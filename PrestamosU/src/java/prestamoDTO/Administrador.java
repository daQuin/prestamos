/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDTO;

import FACTORY.DaoFactory;
import Interfaz.Idependencia;
import Interfaz.Ielemento;
import Interfaz.Iespacio;
import Interfaz.Ievento;
import Interfaz.Isolicitud;
import Interfaz.ItipoPersona;
import java.util.ArrayList;
import java.util.Date;

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
    
    public boolean registrarEspacio(int idSpacios, String nombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia){
        Iespacio a =factor.obtenerConexionEspacio(false);
        Espacio e=new Espacio(idSpacios, nombre, capacidad, dimenciones, descripcion, valor_hora, id_dependencia);
        return a.registrarespacio(e);
    } 
    public boolean actualizarEspacio(int idSpacios, String nombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia){
        Iespacio a=factor.obtenerConexionEspacio(false);
        return a.actualizarespacio(idSpacios, nombre, capacidad, dimenciones, descripcion, valor_hora, id_dependencia);
    }        
    public boolean eliminarEspacio(int id){
        Iespacio a=factor.obtenerConexionEspacio(false);
        return a.eliminarespacio(id);
    }
    public Espacio consultarEspacio(int id){
        Iespacio a=factor.obtenerConexionEspacio(false);
        Espacio e = a.consultarespacio(id);
        return e;
    }
    public ArrayList<Espacio> listarEspacio(){
        Iespacio a=factor.obtenerConexionEspacio(false);
        ArrayList<Espacio>es=a.listarespacios();
        return es;
    }
    
    public boolean registrarEvento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler){
        Ievento a =factor.obtenerConexionEvento(false);
        Evento ev=new Evento(id_evento, nombre, tipoEvento, descripcion, solicitud_alquiler);
        return a.registrarevento(ev);
    }
    
    public boolean actualizarEvento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler){
        Ievento a =factor.obtenerConexionEvento(false);
        return a.actualizarevento(id_evento, nombre, tipoEvento, descripcion, solicitud_alquiler);
    }        
    public boolean eliminarEvento(int id){
        Ievento a=factor.obtenerConexionEvento(false);
        return a.eliminarevento(id);
    }
    public Evento consultarEvento(int id){
        Ievento a=factor.obtenerConexionEvento(false);
        Evento e =a.consultarevento(id);
        return e;
    }   
    public ArrayList<Evento> listarEvento(){
        Ievento a=factor.obtenerConexionEvento(false);
        ArrayList<Evento>evn=a.listarevento();
        return evn;
    }
            
    
    public boolean registrardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion) {
        Idependencia a =factor.obtenerConexionDependencia(false);
        Dependencia d=new Dependencia(id_dependencia, nombre, correo, telefono, Ubicacion);
        return a.registrardependencia(d);
    }
    public boolean actualizardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion) {
        Idependencia a=factor.obtenerConexionDependencia(false);
        return a.actualizardependencia(id_dependencia, nombre, correo, telefono, Ubicacion);
    }        
    public boolean eliminardependencia(int id){
        Idependencia a=factor.obtenerConexionDependencia(false);
        return a.eliminardependencia(id);
    }
    public Dependencia consultardependencia(int id){
      Idependencia a =factor.obtenerConexionDependencia(false);
      Dependencia d=a.consultardependencia(id);
      return d;
    }   
    public ArrayList<Dependencia> listardependencia(){
        Idependencia a=factor.obtenerConexionDependencia(false);
        ArrayList<Dependencia>d=a.listardependencia();
        return d;
    } 
     
            
    public boolean registrartipoPersona(String tipoPersona, String descripcion){
        ItipoPersona a=factor.obtenerConexionTipoPersona(false);
        TipoPersona tp=new TipoPersona(tipoPersona, descripcion);
        return a.registrartipopersona(tp);
    }
    public boolean actualizartipoPersona (String tipoPersona, String descripcion){
      ItipoPersona a=factor.obtenerConexionTipoPersona(false);
      return a.actualizartipopersona(tipoPersona, descripcion);
    }      
    public boolean eliminartipoPersona(String tipo){
        ItipoPersona a =factor.obtenerConexionTipoPersona(false);
        return a.eliminartipopersona(tipo);
        
    }
    public TipoPersona consultartipoPersona (String tipo){
        ItipoPersona a=factor.obtenerConexionTipoPersona(false);
        TipoPersona tp=a.consultartipopersona(tipo);
        return tp;
    }  
    public ArrayList<TipoPersona> listartipoPersona (){
        ItipoPersona a=factor.obtenerConexionTipoPersona(false);
        ArrayList<TipoPersona>tp=a.listartipoPersona();
        return tp;
    } 
            
            
    public boolean actualizarSolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud) {
        Isolicitud a =factor.obtenerConexionSolicitud(false);
        return a.actualizarsolicitud(nombre, descripcion, fecha, hora, duracion, estado, espacio, cedula_Persona, id_solicitud);
    }        
    public boolean eliminarSolicitud(int id){
        Isolicitud a =factor.obtenerConexionSolicitud(false);
        return a.eliminarsolicitud(id);
    }
    public Solicitud consultarSolicitud(int id){
        Isolicitud a =factor.obtenerConexionSolicitud(false);
        Solicitud s =a.consultarsolicitud(id);
        return s;
    }
    public ArrayList<Solicitud> listarSolicitud (){
        Isolicitud a =factor.obtenerConexionSolicitud(false);
        ArrayList<Solicitud>s=a.listarsolicitud();
        return s;
    }       
    
}
