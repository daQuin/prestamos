/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Iadministrador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Administrador;


/**
 *
 * @author Juan
 */
public class AdministradorDAO extends MySQLconexion implements Iadministrador{

    public AdministradorDAO(boolean keepConnection) {
        super(keepConnection);
    }

    @Override
    public boolean registraradministrador(Administrador a) {
boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into administrador (user_name,correo,"
                    + "password"
                    + ") values (?,?,?)");
            stmt.setString(1, a.getUser_name());
            stmt.setString(2, a.getCorreo());
            stmt.setString(3, a.getPasword());
           
            int aux = stmt.executeUpdate();
            if (aux > 0) {
                exito = true;
                stmt.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion ");
                    } catch (Exception ex) {
                        Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }

    @Override
    public boolean actualizaradministrador(String user_name, String correo, String pasword) {
boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update dependencia set correo=?,"
                    + "password=? where user_name='" + user_name + "'");
                    
            smtm.setString(1, correo);
            smtm.setString(2, user_name);
            
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
    public Administrador consultaradministrador(String user_name) {
Administrador aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from administrador where  "
                    + "user_name='" + user_name+ "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Administrador();
                aux.setUser_name(a.getString(1));
                aux.setCorreo(a.getString(2));
                aux.setPasword(a.getString(3));
               
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }

    @Override
    public boolean eliminaradministrador(String user_name) {
PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select user_name from administrador");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Administrador a = new Administrador();
                a.setUser_name(aux.getString(1));
                if (a.getUser_name()==user_name) {
                    stmt = super.getConn().prepareStatement("delete from administrador where user_name='" + user_name+ "'");
                    System.out.println("Se esta Eliminando una administrador");
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
                        Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }

    @Override
    public ArrayList<Administrador> listarstradoradmin() {
ArrayList<Administrador> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Administrador>();
            stmt = super.getConn().prepareStatement("select * from administrador");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Administrador adm = new Administrador();
                adm.setUser_name(aux.getString(1));
                adm.setCorreo(aux.getString(2));
                adm.setPasword(aux.getString(3));
               
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;   
    }
    
}
