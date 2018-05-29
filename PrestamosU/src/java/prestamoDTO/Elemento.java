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
public class Elemento {
    private int id;
    private String nombre;
    private String valor;
    private String cantidad;
    private String descripcion;
    private Espacio id_espacio;

    public Elemento() {
    }

    public Elemento(int id, String nombre, String valor, String cantidad, String descripcion, Espacio id_espacio) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.id_espacio = id_espacio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Espacio getId_espacio() {
        return id_espacio;
    }

    public void setId_espacio(Espacio id_espacio) {
        this.id_espacio = id_espacio;
    }
    
    
}
