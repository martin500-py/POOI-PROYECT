
package CLASES_HUMANO;

import java.time.LocalDate;


public  class PERSONA  {
    
    protected String codigo;
    protected String contraseña;
    protected String dni;
    protected String nombre_completo;
    protected String telefono;
    protected String correoinstitucional;

    public PERSONA(String codigo, String contraseña, String dni, String nombre_completo, String telefono, String correoinstitucional) {
        this.codigo = codigo;
        this.contraseña = contraseña;
        this.dni = dni;
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.correoinstitucional = correoinstitucional;
    }

    public PERSONA() {
    }

    
    


  
    
}
