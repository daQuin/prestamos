/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Ievento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Evento;
import prestamoDTO.Persona;
import prestamoDTO.Solicitud;
import prestamoDTO.TipoPersona;

/**
 *
 * @author estudiante
 */
public class EventoDAO extends MySQLconexion implements Ievento {
    SolicitudDAO sol;

    public EventoDAO(boolean keepConnection) {
        super(keepConnection);
        sol=new  SolicitudDAO(keepConnection);
    }

    @Override
    public boolean registrarevento(Evento e) {
        boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into evento (idEvento,nombre,tipo_evento,"
                    + "descripcion, solicitud_alquiler_id"
                    + ") values (?,?,?,?,?)");
            stmt.setInt(1, e.getId_evento());
            stmt.setString(2, e.getNombre());
            stmt.setString(3, e.getTipoEvento());
            stmt.setString(4, e.getDescripcion());
            
            stmt.setInt(5, e.getSolicitud_alquiler().getId_solicitud());
        
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
    public boolean actualizarevento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler) {
        boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update evento set nombre=?,tipo_evento=?,"
                    + "descripcion=?, solicitud_alquiler_id=?  where idEvento='" + id_evento + "'");
                    
            smtm.setString(1, nombre);
            smtm.setString(2, tipoEvento);
            smtm.setString(3, descripcion);
            smtm.setInt(4, solicitud_alquiler.getId_solicitud());
  
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
    public Evento consultarevento(int id_evento) {
        Evento aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from evento where  "
                    + "idEvento='" + id_evento + "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Evento();
                
                aux.setId_evento(a.getInt(1));
                aux.setNombre(a.getString(2));
                aux.setTipoEvento(a.getString(3));
                aux.setDescripcion(a.getString(4));
                Solicitud s = new Solicitud();
                s=sol.consultarsolicitud(a.getInt(5));
                aux.setSolicitud_alquiler(s);

            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }

    @Override
    public boolean eliminarevento(int id_evento) {
        PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select idEvento from evento");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Evento e = new Evento();
                e.setId_evento(aux.getInt(1));
                
                if (e.getId_evento()==id_evento) {
                    stmt = super.getConn().prepareStatement("delete from evento where idEvento='" + id_evento + "'");
                    System.out.println("Se esta Eliminando un evento");
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
    public ArrayList<Evento> listarevento() {
        ArrayList<Evento> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Evento>();
            stmt = super.getConn().prepareStatement("select * from evento");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Evento eve = new Evento();
                eve.setId_evento(aux.getInt(1));
                eve.setNombre(aux.getString(2));
                eve.setTipoEvento(aux.getString(3));
                eve.setDescripcion(aux.getString(4));
                Solicitud s = new Solicitud();
                s=sol.consultarsolicitud(aux.getInt(5));
                eve.setSolicitud_alquiler(s);
                a.add(eve);
               
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    
}
