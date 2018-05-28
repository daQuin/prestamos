/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDTO;

import java.util.Date;

/**
 *
 * @author Juan
 */
class Solicitud {
    
    private String nombre;
    private String descripcion;
    private Date fecha;
    private String hora;
    private String duracion;
    private String estado;
    private Espacio espacio;
    private Persona cedula_Persona;
    private int id_solicitud;

    public Solicitud() {
    }

    public Solicitud(String nombre, String descripcion, Date fecha, String hora, String duracion, String estado, Espacio espacio, Persona cedula_Persona, int id_solicitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.estado = estado;
        this.espacio = espacio;
        this.cedula_Persona = cedula_Persona;
        this.id_solicitud = id_solicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Persona getCedula_Persona() {
        return cedula_Persona;
    }

    public void setCedula_Persona(Persona cedula_Persona) {
        this.cedula_Persona = cedula_Persona;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
    
    
}
