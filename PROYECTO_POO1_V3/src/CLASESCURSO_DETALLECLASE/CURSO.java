
package CLASESCURSO_DETALLECLASE;

import CLASES_HUMANO.DOCENTE;

public class CURSO {
    
    DOCENTE docente;
    private String nombrecurso;
    private String codigo;
    private int credito;

    public CURSO(DOCENTE docente, String nombrecurso, String codigo, int credito) {
        this.docente = docente;
        this.nombrecurso = nombrecurso;
        this.codigo = codigo;
        this.credito = credito;
    }

    

    public DOCENTE getDocente() {
        return docente;
    }

    public void setDocente(DOCENTE docente) {
        this.docente = docente;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
    
    
    
    
    
    
}
