/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Idependencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Dependencia;


/**
 *
 * @author Juan
 */
public class DependenciaDAO extends MySQLconexion implements Idependencia{

    public DependenciaDAO(boolean keepConnection) {
        super(keepConnection);
    }

    @Override
    public boolean registrardependencia(Dependencia d) {
 boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into dependencia (id_dependencia,nombre,correo,"
                    + "telefono, ubicacion"
                    + ") values (?,?,?,?,?)");
            stmt.setInt(1, d.getId_dependencia());
            stmt.setString(2, d.getNombre());
            stmt.setString(3, d.getCorreo());
            stmt.setString(4, d.getTelefono());
            stmt.setString(5, d.getUbicacion());
            
            int aux = stmt.executeUpdate();
            if (aux > 0) {
                exito = true;
                stmt.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(DependenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion ");
                    } catch (Exception ex) {
                        Logger.getLogger(DependenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }

    @Override
    public boolean actualizardependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion) {
boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update dependencia set nombre=?,correo=?,"
                    + "telefono=?, ubicacion=? where id_dependencia='" + id_dependencia + "'");
                    
            smtm.setString(1, nombre);
            smtm.setString(2, correo);
            smtm.setString(3, telefono);
            smtm.setString(4, Ubicacion);
            
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
    public Dependencia consultardependencia(int id_dependencia) {
 Dependencia aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from dependencia where  "
                    + "id_dependencia='" + id_dependencia+ "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Dependencia();
                aux.setId_dependencia(a.getInt(1));
                aux.setNombre(a.getString(2));
                aux.setCorreo(a.getString(3));
                aux.setTelefono(a.getString(4));
                aux.setUbicacion(a.getString(5));
                 
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }

    @Override
    public boolean eliminardependencia(int id_dependencia) {
PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select id_dependencia from dependencia");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Dependencia e = new Dependencia();
                e.setId_dependencia(aux.getInt(1));
                if (e.getId_dependencia()==id_dependencia) {
                    stmt = super.getConn().prepareStatement("delete from dependencia where id_dependencia='" + id_dependencia + "'");
                    System.out.println("Se esta Eliminando una dependencia");
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
                        Logger.getLogger(Dependencia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }

    @Override
    public ArrayList<Dependencia> listardependencia() {
ArrayList<Dependencia> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Dependencia>();
            stmt = super.getConn().prepareStatement("select * from elementos");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Dependencia dep = new Dependencia();
                dep.setId_dependencia(aux.getInt(1));
                dep.setNombre(aux.getString(2));
                dep.setCorreo(aux.getString(3));
                dep.setTelefono(aux.getString(4));
                dep.setUbicacion(aux.getString(5));
                 a.add(dep);
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    
}
