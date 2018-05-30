/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Ielemento;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Elemento consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Elemento> listarelementos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
