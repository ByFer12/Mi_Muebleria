

package Personas;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Cliente extends Persona {
    private String nit;
    private String direccion;
    private String municipio;
    private String departamento;

    public Cliente(String nit, String direccion, String municipio, String departamento, String nombre) {
        super(nombre);
        this.nit = nit;
        this.direccion = direccion;
        this.municipio = municipio;
        this.departamento = departamento;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    

}
