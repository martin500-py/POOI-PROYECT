
package CLASES_HUMANO;

import java.time.LocalDate;

public class ALUMNO extends PERSONA {

    private String direccion;
    private int creditos;

    public ALUMNO(String direccion, int creditos, String codigo, String contraseña, String dni, String nombre_completo, String telefono, String correoinstitucional) {
        super(codigo, contraseña, dni, nombre_completo, telefono, correoinstitucional);
        this.direccion = direccion;
        this.creditos = creditos;
    }

    public ALUMNO() {
    }
    
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }
    
    
    

   
    
  
    
    
    
    
}
