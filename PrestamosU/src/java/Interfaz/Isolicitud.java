/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;
import java.util.Date;
import prestamoDTO.Espacio;
import prestamoDTO.Persona;
import prestamoDTO.Solicitud;

/**
 *
 * @author Juan
 */
public interface Isolicitud {
    public boolean registrarsolicitud(Solicitud s);
    public boolean actualizarsolicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud);
    public Solicitud consultarsolicitud(int id_solicitud);
    public boolean eliminarsolicitud(int id_solicitud);
    public ArrayList<Solicitud> listarsolicitud();
}
