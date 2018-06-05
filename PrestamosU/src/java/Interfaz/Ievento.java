/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import prestamoDTO.Evento;
import prestamoDTO.Solicitud;

/**
 *
 * @author Juan
 */
public interface Ievento {
    public boolean registrarevento(Evento e);
    public boolean actualizarevento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler);
    public Evento consultarevento(int id_evento);
    public boolean eliminarevento(int id_evento);
    public ArrayList<Evento> listarevento();
}
