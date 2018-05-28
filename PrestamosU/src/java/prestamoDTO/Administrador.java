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
public class Administrador {
    
    private String user_name;
    private String correo;
    private String pasword;

    public Administrador() {
    }

    public Administrador(String user_name, String correo, String pasword) {
        this.user_name = user_name;
        this.correo = correo;
        this.pasword = pasword;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    
    
    
}
