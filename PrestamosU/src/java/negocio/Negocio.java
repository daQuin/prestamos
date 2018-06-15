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
    private Persona per;

    public Negocio() {
        admin = new Administrador();
        per=new Persona();
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
        System.out.println("ENTROO A REGSTRAR ESPACIO");
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
       try {
            Espacio rta = admin.consultarEspacio(id_espacios);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  
    }

    @Override
    public boolean eliminarespacio(int id_espacios) {

    try {
            boolean rta = admin.eliminarEspacio(id_espacios);
            if (rta == true) {
               
                return rta;
            } else {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;     

    }

    @Override
    public boolean actualizarespacio(int idSpacios, String mombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia) {
 try {
            boolean rta = admin.actualizarEspacio(idSpacios, mombre, capacidad, dimenciones, descripcion, valor_hora, id_dependencia);
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
    public ArrayList<Espacio> listarespacios() {

        ArrayList<Espacio> a = null;
        try {
            a = admin.listarEspacio();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a; 

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
        try {
            boolean rta = admin.registrardependencia(d.getId_dependencia(), d.getNombre(), d.getCorreo(), d.getTelefono(), d.getUbicacion());
            if (rta) {
                System.out.println("Dependencia Registrado");
                return rta;
            } else {
                System.out.println("Dependencia no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;   
    }

    @Override
    public boolean actualizardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion) {
 try {
            boolean rta = admin.actualizardependencia(id_dependencia, nombre, correo, telefono, Ubicacion);
            if (rta) {
                System.out.println("dependencia actualizado");
                return rta;
            } else {
                System.out.println("dependencia no actualizado");
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Dependencia consultardependencia(int id_dependencia) {
        try {
            Dependencia rta = admin.consultardependencia(id_dependencia);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  
    }

    @Override
    public boolean eliminardependencia(int id_dependencia) {
    try {
            boolean rta = admin.eliminardependencia(id_dependencia);
            if (rta == true) {
                System.out.println("Espacio #" + id_dependencia+ "  Eliminado");
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
    public ArrayList<Dependencia> listardependencia() {

  ArrayList<Dependencia> a = null;
        try {
            a = admin.listardependencia();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a; 

    }

    @Override
    public boolean registrarevento(Evento e) {
             try {
            boolean rta = admin.registrarEvento(e.getId_evento(), e.getNombre(), e.getTipoEvento(), e.getDescripcion(), e.getSolicitud_alquiler());
            if (rta) {
                System.out.println("Evento Registrado");
                return rta;
            } else {
                System.out.println("Evento no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean actualizarevento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler) {
         try {
            boolean rta = admin.actualizarEvento(id_evento, nombre, tipoEvento, descripcion, solicitud_alquiler);
            if (rta) {
                System.out.println("evento actualizado");
                return rta;
            } else {
                System.out.println("evento no actualizado");
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Evento consultarevento(int id_evento) {
         try {
            Evento rta = admin.consultarEvento(id_evento);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  
    }

    @Override
    public boolean eliminarevento(int id_evento) {
try {
            boolean rta = admin.eliminarEvento(id_evento);
            if (rta == true) {
                System.out.println("Evento #" + id_evento+ "  Eliminado");
                return rta;
            } else {
                System.out.println("Evento no eliminado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public ArrayList<Evento> listarevento() {
      ArrayList<Evento> a = null;
        try {
            a = admin.listarEvento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean registrarPersona(Persona p) {
        try {
            boolean rta = per.registrarPersona(p.getCedula(), p.getNombre(), p.getApellido(), p.getTelefono(), p.getCorreo(),p.getTipopersona(),p.getPasword());
            if (rta) {
                System.out.println("Persona Registrado");
                return rta;
            } else {
                System.out.println("Persona no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean eliminarPersona(String c) {
    try {
            boolean rta = admin.eliminarpersona(c);
            if (rta == true) {
                System.out.println("persona #" + c+ "  Eliminado");
                return rta;
            } else {
                System.out.println("persona no eliminado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean actualizarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword) {
try {
            boolean rta = per.actualizarPersona(cedula, nombre, apellido, telefono, correo, tipopersona, pasword);
            if (rta) {
                System.out.println("persona actualizado");
                return rta;
            } else {
                System.out.println("persona no actualizado");
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Persona consultarPersona(String c) {
        try {
            Persona rta = admin.consultarPersona(c);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  
    }

    @Override
    public ArrayList<Persona> listarPersona() {
      ArrayList<Persona> a = null;
        try {
            a = admin.listarPersona();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean registrarsolicitud(Solicitud s) {
        try {
            boolean rta = per.solicitarEspacio(s.getNombre(), s.getDescripcion(), s.getFecha(), s.getHora(), s.getDuracion(),s.getEstado(),s.getEspacio(),s.getCedula_Persona(),s.getId_solicitud());
            if (rta) {
                System.out.println("Dependencia Registrado");
                return rta;
            } else {
                System.out.println("Dependencia no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean actualizarsolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud) {
try {
            boolean rta = admin.actualizarSolicitud(nombre, descripcion, fecha, hora, duracion, estado, espacio, cedula_Persona, id_solicitud);
            if (rta) {
                System.out.println("evento actualizado");
                return rta;
            } else {
                System.out.println("evento no actualizado");
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Solicitud consultarsolicitud(int id_solicitud) {
       try {
            Solicitud rta = admin.consultarSolicitud(id_solicitud);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  
    }

    @Override
    public boolean eliminarsolicitud(int id_solicitud) {
 try {
            boolean rta = admin.eliminarSolicitud(id_solicitud);
            if (rta == true) {
                System.out.println("solicitud #" + id_solicitud+ "  Eliminado");
                return rta;
            } else {
                System.out.println("solicitud no eliminado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public ArrayList<Solicitud> listarsolicitud() {
        ArrayList<Solicitud> a = null;
        try {
            a = admin.listarSolicitud();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public boolean registrartipopersona(TipoPersona tp) {
        try {
            boolean rta = admin.registrartipoPersona(tp.getTipoPersona(), tp.getDescripcion());
            if (rta) {
                System.out.println("tip persona Registrado");
                return rta;
            } else {
                System.out.println("tipo persona no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean eliminartipopersona(String tipoPersona) {
  try {
            boolean rta = admin.eliminartipoPersona(tipoPersona);
            if (rta == true) {
                System.out.println("tipo persona #" + tipoPersona+ "  Eliminado");
                return rta;
            } else {
                System.out.println("tipo persona no eliminado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public TipoPersona consultartipopersona(String tipoPersona) {
       try {
            TipoPersona rta = admin.consultartipoPersona(tipoPersona);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;  
    }

    @Override
    public boolean actualizartipopersona(String tipoPersona, String descripcion) {
try {
            boolean rta = admin.actualizartipoPersona(tipoPersona, descripcion);
            if (rta) {
                System.out.println("evento actualizado");
                return rta;
            } else {
                System.out.println("evento no actualizado");
            }

        } catch (Exception e) {
        }
        return false;    }

    @Override
    public ArrayList<TipoPersona> listartipoPersona() {
    ArrayList<TipoPersona> a = null;
        try {
            a = admin.listartipoPersona();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
