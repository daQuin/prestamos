/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Iespacio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prestamoDTO.Dependencia;
import prestamoDTO.Espacio;


/**
 *
 * @author DELL
 */
public class EspacioDAO extends MySQLconexion implements Iespacio{
DependenciaDAO dependenciadao; 
  public EspacioDAO(boolean keepConnection) {
        super(keepConnection);
        dependenciadao = new DependenciaDAO(keepConnection);
    }

    @Override
    public boolean registrarespacio(Espacio e) {
             boolean exito = false;
        try {
            PreparedStatement stmt = null;
            stmt = super.getConn().prepareStatement("insert into espacios (idespacios, nombre, capacidad,"
                    + "dimenciones, descripcion, valor, Elementos_idElementos, Dependencia_id_dependencia"
                    + ") values (?,?,?,?,?,?,?,?)");
            stmt.setInt(1, e.getIdSpacios());
            stmt.setString(2, e.getnombre());
            stmt.setInt(3, e.getCapacidad());
            stmt.setString(4, e.getDimenciones());
            stmt.setString(5, e.getDescripcion());
            stmt.setString(6, e.getValor_hora());
            stmt.setInt(7, e.getId_dependencia().getId_dependencia());
            stmt.setInt(8, e.getId_dependencia().getId_dependencia());
            
            int aux = stmt.executeUpdate();
            if (aux > 0) {
                exito = true;
                stmt.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(EspacioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (!keepConnection) {
                if (super.getConn() != null) {
                    try {
                        super.getConn().close();
                        System.out.println("se cerro la conexion ");
                    } catch (Exception ex) {
                        Logger.getLogger(EspacioDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return exito;
    }

    @Override
    public Espacio consultarespacio(int id_espacios) {
        Espacio aux = null;
        PreparedStatement stmt = null;
        try {
            stmt = super.getConn().prepareStatement("select * from espacios where  "
                    + "idespacios='" + id_espacios + "'");
            ResultSet a = stmt.executeQuery();
            while (a.next()) {
                aux = new Espacio();
                aux.setIdSpacios(a.getInt(1));
                aux.setnombre(a.getString(2));
                aux.setCapacidad(a.getInt(3));
                aux.setDimenciones(a.getString(4));
                aux.setDescripcion(a.getString(5));
                aux.setValor_hora(a.getString(6));
                Dependencia d = new Dependencia();
                d= dependenciadao.consultardependencia(a.getInt(7));
                aux.setId_dependencia(d);
                
                
            }
            
            a.close();
            return aux;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aux;
                }

    @Override
    public boolean eliminarespacio(int id_espacios) {
PreparedStatement stmt = null;
        boolean exito = false;
        try {
            stmt = super.getConn().prepareStatement("select idespacios from espacios");
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Espacio e = new Espacio();
                e.setIdSpacios(aux.getInt(1));
                if (e.getIdSpacios()==id_espacios) {
                    stmt = super.getConn().prepareStatement("delete from espacios where idespacios='" + id_espacios + "'");
                    System.out.println("Se esta Eliminando un espacio");
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
        return exito;    }

    @Override
    public boolean actualizarespacio(int idSpacios, String nombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia) {
 boolean exito = false;
        PreparedStatement smtm = null;
        try {
            smtm = super.getConn().prepareStatement("update espacios set nombre=?,capacidad=?,"
                    + "dimenciones=?, descripcion=?, valor=?, Dependencia_id_dependencia=? where idespacios='" + idSpacios + "'");
                    
            smtm.setString(1, nombre);
            smtm.setInt(2, capacidad);
            smtm.setString(3, dimenciones);
            smtm.setString(4, descripcion);
            smtm.setString(5, valor_hora);
            smtm.setInt(6, id_dependencia.getId_dependencia());
            
            
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
    public ArrayList<Espacio> listarespacios() {
ArrayList<Espacio> a = null;
        PreparedStatement stmt = null;
        PreparedStatement auxi = null;
        
        try {
            a = new ArrayList<Espacio>();
            stmt = super.getConn().prepareStatement("select * from espacios");
            
            ResultSet aux = stmt.executeQuery();
            while (aux.next()) {
                Espacio esp = new Espacio();
                esp.setIdSpacios(aux.getInt(1));
                esp.setnombre(aux.getString(2));
                esp.setCapacidad(aux.getInt(3));
                esp.setDimenciones(aux.getString(4));
                esp.setDescripcion(aux.getString(5));
                esp.setValor_hora(aux.getString(6));
                Dependencia d = new Dependencia();
                d.setId_dependencia(aux.getInt(7));
                esp.setId_dependencia(d);
                 a.add(esp);
                
            }
            aux.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    
}
