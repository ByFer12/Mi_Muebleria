/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personas;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Usuario extends Persona {
    
    private String password;
    private int codArea;

    public Usuario(String password, int codArea, String nombre) {
        super(nombre);
        this.password = password;
        this.codArea = codArea;
    }

    public String getPassword() {
        return password;
    }

    public int getCodArea() {
        return codArea;
    }
    
    
}
