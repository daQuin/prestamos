/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;


/**
 *
 * @author Juan
 */
import java.util.ArrayList;
import prestamoDTO.Elemento;
import prestamoDTO.Espacio;
public interface Ielemento {
    public boolean registrarelemento(Elemento e);
    public boolean actualizarelemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio);
    public Elemento consultar(int id);
    public boolean eliminarElemento(int id);
    public ArrayList<Elemento>listarelementos();
}
