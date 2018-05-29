/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Ipersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Persona;
import prestamoDTO.TipoPersona;

/**
 *
 * @author DELL
 */
public class personaDAO extends MySQLconexion implements Ipersona{

     public personaDAO(boolean keepConnection) {
        super(keepConnection);
    }
    
    
    @Override
    public boolean registrarPersona(Persona p) {

         boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into persona (cedula_ciuddania,nombre,apellido,"
                    + "telefono, correo, tipoPersona_tipo, password"
                    + ") values (?,?,?,?,?,?,?)");
            stmt.setString(1, p.getCedula());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getApellido());
            stmt.setString(4, p.getTelefono());
            stmt.setString(5, p.getCorreo());
            stmt.setString(6, p.getTipopersona().getTipoPersona());
            stmt.setString(7, p.getPasword());
            
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
    public boolean eliminarPersona(String c) {
   PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select cedula_ciuddania from persona");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Persona p = new Persona();
                p.setCedula(aux.getString(1));
                if (p.getCedula().equalsIgnoreCase(c)) {
                    stmt = super.getConn().prepareStatement("delete from persona where cedula_ciuddania='" + c + "'");
                    System.out.println("Se esta Eliminando una persona");
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
    public boolean actualizarPersona(String cedula, String nombre, String apellido, String telefono, String correo, TipoPersona tipopersona, String pasword) {
          boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update persona set nombre=?,apellido=?,"
                    + "telefono=?, correo=?, tipoPersona_tipo=?, password=? where cedula_ciuddania='" + cedula + "'");
                    
            smtm.setString(1, nombre);
            smtm.setString(2, apellido);
            smtm.setString(3, telefono);
            smtm.setString(4, correo);
            smtm.setString(5, tipopersona.getTipoPersona());
            smtm.setString(6, pasword);
            
            
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
    public Persona consultarPersona(String c) {
           Persona aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from persona where  "
                    + "cedula_ciuddania='" + c + "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Persona();
                aux.setCedula(a.getString(1));
                aux.setNombre(a.getString(2));
                aux.setApellido(a.getString(3));
                aux.setTelefono(a.getString(4));
                aux.setCorreo(a.getString(5));
                TipoPersona t = new TipoPersona();
                
                t.setTipoPersona(a.getString(6));
                
                aux.setTipopersona(t);
                
                aux.setPasword(a.getString(7));
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }

    @Override
    public ArrayList<Persona> listarPersona() {

        ArrayList<Persona> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Persona>();
            stmt = super.getConn().prepareStatement("select * from persona");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Persona per = new Persona();
                per.setCedula(aux.getString(1));
                per.setNombre(aux.getString(2));
                per.setApellido(aux.getString(3));
                per.setTelefono(aux.getString(4));
                per.setCorreo(aux.getString(5));
                TipoPersona t = new TipoPersona();
                t.setTipoPersona(aux.getString(6));
                per.setTipopersona(t);
                per.setPasword(aux.getString(7));
                a.add(per);
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
        
    }
    
}
