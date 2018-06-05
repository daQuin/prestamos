/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Interfaz.Inegocio;
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
public class Negocio implements Inegocio {

    private Administrador admin;

    public Negocio() {
        admin = new Administrador();
    }

    @Override
    public boolean registrarelemento(Elemento e) {

        try {
            boolean rta = admin.registrarElemento(e.getId(), e.getNombre(), e.getValor(), e.getCantidad(), e.getDescripcion(), e.getId_espacio());
            if (rta) {
                System.out.println("Elemento Registrado");
                return rta;
            } else {
                System.out.println("Elemento no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean actualizarelemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio) {

        try {
            boolean rta = admin.actualizarElemento(id, nombre, valor, cantidad, descripcion, id_espacio);
            if (rta) {
                System.out.println("Elemento actualizado");
                return rta;
            } else {
                System.out.println("Elemento no actualizado");
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Elemento consultar(int id) {
        try {
            Elemento rta = admin.consultarElemento(id);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean eliminarElemento(int id) {
        try {
            boolean rta = admin.eliminarElemento(id);
            if (rta == true) {
                System.out.println("Elemento #" + id + "  Eliminado");
                return rta;
            } else {
                System.out.println("Elemento no eliminado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    @Override
    public ArrayList<Elemento> listarelementos() {
      ArrayList<Elemento> a = null;
        try {
            a = admin.listarElementos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;  
    }

    @Override
    public boolean registrarespacio(Espacio e) {
  try {
            boolean rta = admin.registrarEspacio(e.getIdSpacios(), e.getnombre(), e.getCapacidad(), e.getDimenciones(), e.getDescripcion(),e.getValor_hora(), e.getId_dependencia());
            if (rta) {
                System.out.println("Elemento Registrado");
                return rta;
            } else {
                System.out.println("Elemento no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public Espacio consultarespacio(int id_espacios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarespacio(int id_espacios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarespacio(int idSpacios, String mombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Espacio> listarespacios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registraradministrador(Administrador a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizaradministrador(String user_name, String correo, String pasword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador consultaradministrador(String user_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminaradministrador(String user_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Administrador> listarstradoradmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrardependencia(Dependencia d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dependencia consultardependencia(int id_dependencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminardependencia(int id_dependencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Dependencia> listardependencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarevento(Evento e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarevento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento consultarevento(int id_evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarevento(int id_evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Evento> listarevento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarPersona(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona consultarPersona(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Persona> listarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarsolicitud(Solicitud s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarsolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Solicitud consultarsolicitud(int id_solicitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarsolicitud(int id_solicitud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Solicitud> listarsolicitud() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrartipopersona(TipoPersona tp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminartipopersona(String tipoPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoPersona consultartipopersona(String tipoPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizartipopersona(String tipoPersona, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TipoPersona> listartipoPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
