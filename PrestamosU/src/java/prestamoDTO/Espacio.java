/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamoDTO;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Espacio {
    private int idSpacios;
    private String nombre;
    private int capacidad;
    private String dimenciones;
    private String descripcion;
    private String valor_hora;
    private Dependencia id_dependencia;

    public Espacio() {
    }

    public Espacio(int idSpacios, String nombre, int capacidad, String dimenciones, String descripcion, String valor_hora, Dependencia id_dependencia) {
        this.idSpacios = idSpacios;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.dimenciones = dimenciones;
        this.descripcion = descripcion;
        this.valor_hora = valor_hora;
        this.id_dependencia = id_dependencia;
    }

   
    public int getIdSpacios() {
        return idSpacios;
    }

    public void setIdSpacios(int idSpacios) {
        this.idSpacios = idSpacios;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String mombre) {
        this.nombre = mombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(String dimenciones) {
        this.dimenciones = dimenciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(String valor_hora) {
        this.valor_hora = valor_hora;
    }

    public Dependencia getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(Dependencia id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

   
    
   
    
    
}
