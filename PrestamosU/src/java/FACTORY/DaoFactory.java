/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACTORY;

import Interfaz.Iadministrador;
import Interfaz.Idependencia;
import Interfaz.Ielemento;
import Interfaz.Iespacio;
import Interfaz.Ievento;
import Interfaz.Ipersona;
import Interfaz.ItipoPersona;
import prestamoDAO.AdministradorDAO;
import prestamoDAO.DependenciaDAO;
import prestamoDAO.ElementoDAO;
import prestamoDAO.EspacioDAO;
import prestamoDAO.EventoDAO;
import prestamoDAO.TipoPersonaDao;
import prestamoDAO.personaDAO;


public class DaoFactory {
 public Iadministrador obtenerUsuario(boolean keepConnection) {
        return new AdministradorDAO(keepConnection);
    }
 public Idependencia obtenerConexionDependencia(boolean keepConnection) {
        return new DependenciaDAO (keepConnection);
    }
 
  public Ielemento obtenerConexionElemento(boolean keepConnection) {
        return new ElementoDAO(keepConnection);
    }
 public Iespacio obtenerConexionEspacio(boolean keepConnection) {
        return new EspacioDAO(keepConnection);
    }
 public Ievento obtenerConexionEvento(boolean keepConnection) {
        return new EventoDAO(keepConnection);
    }
  public Ipersona obtenerConexionPersona(boolean keepConnection) {
        return new personaDAO(keepConnection);
    }
    public ItipoPersona obtenerConexionTipoPersona(boolean keepConnection) {
        return new TipoPersonaDao(keepConnection);
    }
   
    public Iadministrador obtenerConexionAdmin(boolean keepConnection) {

         return new AdministradorDAO(keepConnection);
    }
 
}
