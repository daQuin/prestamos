/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Ipersona;
import Interfaz.Isolicitud;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Espacio;
import prestamoDTO.Evento;
import prestamoDTO.Persona;
import prestamoDTO.Solicitud;
import prestamoDTO.TipoPersona;

/**
 *
 * @author estudiante
 */
public class SolicitudDAO extends MySQLconexion implements Isolicitud {
EspacioDAO esp;
personaDAO per;
    public SolicitudDAO(boolean keepConnection) {
        super(keepConnection);
        per=new personaDAO(keepConnection);
        esp=new EspacioDAO(keepConnection);
    }

    @Override
    public boolean registrarsolicitud(Solicitud s) {
        boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into solicitud_alquiler (nombre,descripccion,fecha,"
                    + "hora, duracion, estado, espacios_idespacios,persona_cedula_ciuddania,id"
                    + ") values (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, s.getNombre());
            stmt.setString(2, s.getDescripcion());
            stmt.setString(3, s.getFecha().toString());//consultar
            stmt.setString(4, s.getHora());
            stmt.setString(5, s.getDuracion());
            stmt.setString(6, s.getEstado());
            stmt.setInt(7, s.getEspacio().getIdSpacios());
            stmt.setString(8, s.getCedula_Persona().getCedula());
            stmt.setInt(9, s.getId_solicitud());
            
            int aux = stmt.executeUpdate();
            if (aux > 0) {
                exito = true;
                stmt.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(personaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion ");
                    } catch (Exception ex) {
                        Logger.getLogger(personaDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }

    @Override
    public boolean actualizarsolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud) {
       boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update solicitud_alquiler set nombre=?,descripccion=?,"
                    + "fecha=?, hora=?, duracion=?, estado=?, espacios_idespacios=?  where id='" + id_solicitud + "'");
                    
            smtm.setString(1, nombre);
            smtm.setString(2, descripcion);
            smtm.setString(3, fecha.toString());
            smtm.setString(4, hora);
            smtm.setString(5, duracion);
            smtm.setString(6, estado);
            smtm.setInt(7, espacio.getIdSpacios());
            
            
            int total = smtm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exito;

    }


    @Override
    public Solicitud consultarsolicitud(int id_solicitud) {
        Solicitud aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from solicitud_alquiler where  "
                    + "id='" + id_solicitud + "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Solicitud();
                aux.setNombre(a.getString(1));
                aux.setDescripcion(a.getString(2));
                aux.setFecha(a.getDate(3));
                aux.setHora(a.getString(4));
                aux.setDuracion(a.getString(5));
                aux.setEstado(a.getString(6));
                Espacio e = new Espacio();
                e=esp.consultarespacio(a.getInt(7));
                aux.setEspacio(e);
                Persona p = new Persona();
                p=per.consultarPersona(a.getString(9));
                aux.setCedula_Persona(p);
                aux.setId_solicitud(a.getInt(9));
 
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }

    @Override
    public boolean eliminarsolicitud(int id_solicitud) {
        PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select id from solicitud_alquiler");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Solicitud s = new Solicitud();
                s.setId_solicitud(aux.getInt(1));
                
                if (s.getId_solicitud()==id_solicitud) {
                    stmt = super.getConn().prepareStatement("delete from solicitud_alquiler where id='" + id_solicitud + "'");
                    System.out.println("Se esta Eliminando una solicitud");
                    stmt.executeUpdate();
                    
                    exito = true;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion elim ");
                    } catch (SQLException ex) {
                        Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
           
    }

    @Override
    public ArrayList<Solicitud> listarsolicitud() {
        ArrayList<Solicitud> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Solicitud>();
            stmt = super.getConn().prepareStatement("select * from solicitud_alquiler");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Solicitud sol = new Solicitud();
                sol.setNombre(aux.getString(1));
                sol.setDescripcion(aux.getString(2));
                sol.setFecha(aux.getDate(3));
                sol.setHora(aux.getString(4));
                sol.setDuracion(aux.getString(5));
                sol.setEstado(aux.getString(6));
                Espacio e = new Espacio();
                e=esp.consultarespacio(aux.getInt(7));
                sol.setEspacio(e);
                Persona p = new Persona();
                p=per.consultarPersona(aux.getString(8));
                sol.setCedula_Persona(p);
                sol.setId_solicitud(aux.getInt(9));
                a.add(sol);
               
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    
}
