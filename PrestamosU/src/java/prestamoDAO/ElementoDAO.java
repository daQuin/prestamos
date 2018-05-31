/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Ielemento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Dependencia;
import prestamoDTO.Elemento;
import prestamoDTO.Espacio;

/**
 *
 * @author Juan
 */
public class ElementoDAO extends MySQLconexion implements Ielemento{

    public ElementoDAO(boolean keepConnection) {
        super(keepConnection);
    }

    @Override
    public boolean registrarelemento(Elemento e) {

         boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into elementos (idElementos,nombre,valor,"
                    + "cantidad, descripcion, espacios_idespacios"
                    + ") values (?,?,?,?,?,?)");
            stmt.setInt(1, e.getId());
            stmt.setString(2, e.getNombre());
            stmt.setString(3, e.getValor());
            stmt.setString(4, e.getCantidad());
            stmt.setString(5, e.getDescripcion());
            stmt.setInt(6, e.getId_espacio().getIdSpacios());
            
            
            int aux = stmt.executeUpdate();
            if (aux > 0) {
                exito = true;
                stmt.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(ElementoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion ");
                    } catch (Exception ex) {
                        Logger.getLogger(ElementoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;    }

    @Override
    public boolean actualizarelemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio) {
boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update elementos set nombre=?,valor=?,"
                    + "cantidad=?, descripcion=?, espacios_idespacios=? where idElementos='" + id + "'");
                    
            smtm.setString(1, nombre);
            smtm.setString(2, valor);
            smtm.setString(3, cantidad);
            smtm.setString(4, descripcion);
            smtm.setInt(5, id_espacio.getIdSpacios());
            
            int total = smtm.executeUpdate();
            if (total > 0) {
                exito = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exito;    }

    @Override
    public Elemento consultar(int id) {
     Elemento aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from elementos where  "
                    + "idElementos='" + id+ "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Elemento();
                aux.setId(a.getInt(1));
                aux.setNombre(a.getString(2));
                aux.setValor(a.getString(3));
                aux.setCantidad(a.getString(4));
                aux.setDescripcion(a.getString(5));
                Espacio e = new Espacio();
                e.setIdSpacios(a.getInt(6));
                aux.setId_espacio(e); 
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
    }

    @Override
    public ArrayList<Elemento> listarelementos() {
ArrayList<Elemento> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Elemento>();
            stmt = super.getConn().prepareStatement("select * from elementos");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Elemento elem = new Elemento();
                elem.setId(aux.getInt(1));
                elem.setNombre(aux.getString(2));
                elem.setValor(aux.getString(3));
                elem.setCantidad(aux.getString(4));
                elem.setDescripcion(aux.getString(5));
                Espacio e = new Espacio();
                e.setIdSpacios(aux.getInt(6));
                elem.setId_espacio(e);
                
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }    

    @Override
    public boolean eliminarElemento(int id) {
PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select idElementos from elementos");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Elemento e = new Elemento();
                e.setId(aux.getInt(1));
                if (e.getId()==id) {
                    stmt = super.getConn().prepareStatement("delete from elementos where idElementos='" + id + "'");
                    System.out.println("Se esta Eliminando un elemento");
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
                        Logger.getLogger(Espacio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }
    
}
