/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Interfaz.Inegocio;
import java.util.ArrayList;
import prestamoDTO.Administrador;
import prestamoDTO.Dependencia;
import prestamoDTO.Elemento;
import prestamoDTO.Espacio;

/**
 *
 * @author DELL
 */
public class Negocio implements Inegocio {

    private Administrador admin;

    public Negocio() {
        admin = new Administrador();
    }

    @Override
    public boolean registrarelemento(Elemento e) {

        try {
            boolean rta = admin.registrarElemento(e.getId(), e.getNombre(), e.getValor(), e.getCantidad(), e.getDescripcion(), e.getId_espacio());
            if (rta) {
                System.out.println("Elemento Registrado");
                return rta;
            } else {
                System.out.println("Elemento no Registrado");
            }

        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public boolean actualizarelemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio) {

        try {
            boolean rta = admin.actualizarElemento(id, nombre, valor, cantidad, descripcion, id_espacio);
            if (rta) {
                System.out.println("Elemento Registrado");
                return rta;
            } else {
                System.out.println("Elemento no Registrado");
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Elemento consultar(int id) {
        try {
            Elemento rta = admin.consultarElemento(id);
            return rta;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean eliminarElemento(int id) {
        try {
            boolean rta = admin.eliminarElemento(id);
            if (rta == true) {
                System.out.println("Elemento #" + id + "  Eliminado");
                return rta;
            } else {
                System.out.println("Elemento no eliminado");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;

    }

    @Override
    public ArrayList<Elemento> listarelementos() {
      ArrayList<Elemento> a = null;
        try {
            a = admin.listarElementos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;  
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
