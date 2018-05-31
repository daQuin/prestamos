/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.ItipoPersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Administrador;
import prestamoDTO.TipoPersona;

/**
 *
 * @author Juan
 */
public class TipoPersonaDao extends MySQLconexion implements ItipoPersona{

    public TipoPersonaDao(boolean keepConnection) {
        super(keepConnection);
    }

    @Override
    public boolean registrartipopersona(TipoPersona tp) {
boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into tipopersona (tipo,"
                    + "descripcion"
                    + ") values (?,?)");
            stmt.setString(1, tp.getTipoPersona());
            stmt.setString(2, tp.getDescripcion());
           
            int aux = stmt.executeUpdate();
            if (aux > 0) {
                exito = true;
                stmt.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(TipoPersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion ");
                    } catch (Exception ex) {
                        Logger.getLogger(TipoPersonaDao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;    }

    @Override
    public boolean eliminartipopersona(String tipoPersona) {
PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select tipo from tipopersona");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                TipoPersona tp = new TipoPersona();
                tp.setTipoPersona(aux.getString(1));
                if (tp.getTipoPersona()==tipoPersona) {
                    stmt = super.getConn().prepareStatement("delete from tipopersona where tipo='" + tipoPersona+ "'");
                    System.out.println("Se esta Eliminando una tipo persona");
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
                        Logger.getLogger(TipoPersona.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }
    
        

    @Override
    public TipoPersona consultartipopersona(String tipoPersona) {
TipoPersona aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from tipopersona where  "
                    + "tipo='" + tipoPersona+ "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new TipoPersona();
                aux.setTipoPersona(a.getString(1));
                aux.setDescripcion(a.getString(2));
                              
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;    
    }

    @Override
    public boolean actualizartipopersona(String tipoPersona, String descripcion) {
boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update tipopersona set descripcion"
                    + " where tipo='" + tipoPersona + "'");
                    
            smtm.setString(1, descripcion);
                      
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
    public ArrayList<TipoPersona> listartipoPersona() {
ArrayList<TipoPersona> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<TipoPersona>();
            stmt = super.getConn().prepareStatement("select * from tipopersona");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                TipoPersona tp = new TipoPersona();
                tp.setTipoPersona(aux.getString(1));
                tp.setDescripcion(aux.getString(2));
                 a.add(tp);
                           
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    
}
