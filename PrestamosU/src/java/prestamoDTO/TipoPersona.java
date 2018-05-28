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
public class TipoPersona {
    private String tipoPersona;
    private String descripcion;

    public TipoPersona() {
    }

    public TipoPersona(String tipoPersona, String descripcion) {
        this.tipoPersona = tipoPersona;
        this.descripcion = descripcion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
