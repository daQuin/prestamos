/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDTO;

/**
 *
 * @author Juan
 */
public class Evento {
   
    private int id_evento;
    private String nombre;
    private String tipoEvento;
    private String descripcion;
    private Solicitud solicitud_alquiler;

    public Evento() {
    }

    public Evento(int id_evento, String nombre, String tipoEvento, String descripcion, Solicitud solicitud_alquiler) {
        this.id_evento = id_evento;
        this.nombre = nombre;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.solicitud_alquiler = solicitud_alquiler;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Solicitud getSolicitud_alquiler() {
        return solicitud_alquiler;
    }

    public void setSolicitud_alquiler(Solicitud solicitud_alquiler) {
        this.solicitud_alquiler = solicitud_alquiler;
    }
    
    
    
}
