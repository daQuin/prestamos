/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.Dependencia;
import prestamoDTO.Espacio;

/**
 *
 * @author Juan
 */
public interface Iespacio {
    public boolean registrarespacio(Espacio e);
    public Espacio consultarespacio(int id_espacios);
    public boolean eliminarespacio(int id_espacios);
    public boolean actualizarespacio(int idSpacios, String mombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia);
    public ArrayList<Espacio> listarespacios();
}
