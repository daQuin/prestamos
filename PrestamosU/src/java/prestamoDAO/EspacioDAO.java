/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDAO;

import Interfaz.Iespacio;
import java.util.ArrayList;
import prestamoDTO.Dependencia;
import prestamoDTO.Espacio;

/**
 *
 * @author DELL
 */
public class EspacioDAO extends MySQLconexion implements Iespacio{

  public EspacioDAO(boolean keepConnection) {
        super(keepConnection);
    }

    @Override
    public boolean registrarespacio(Espacio e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Espacio consultarespacio(int id_espacios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarespacio(int id_espacios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarespacio(int idSpacios, String mombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Espacio> listarespacios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
