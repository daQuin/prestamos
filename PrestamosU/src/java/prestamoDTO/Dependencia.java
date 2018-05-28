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
public class Dependencia {
   private int id_dependencia;
   private String nombre;
   private String correo;
   private String telefono;
   private String Ubicacion;

    public Dependencia() {
    }

    public Dependencia(int id_dependencia, String nombre, String correo, String telefono, String Ubicacion) {
        this.id_dependencia = id_dependencia;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.Ubicacion = Ubicacion;
    }

    public int getId_dependencia() {
        return id_dependencia;
    }

    public void setId_dependencia(int id_dependencia) {
        this.id_dependencia = id_dependencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
   
   
   
   
}
