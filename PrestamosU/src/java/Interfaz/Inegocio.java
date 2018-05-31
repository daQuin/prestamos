/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.Dependencia;
import prestamoDTO.Elemento;
import prestamoDTO.Espacio;

/**
 *
 * @author DELL
 */
public interface Inegocio {
    
    public boolean registrarelemento(Elemento e);
    public boolean actualizarelemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio);
    public Elemento consultar(int id);
    public boolean eliminarElemento(int id);
    public ArrayList<Elemento>listarelementos();
    
    public boolean registrarespacio(Espacio e);
    public Espacio consultarespacio(int id_espacios);
    public boolean eliminarespacio(int id_espacios);
    public boolean actualizarespacio(int idSpacios, String mombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia);
    public ArrayList<Espacio> listarespacios();

}
