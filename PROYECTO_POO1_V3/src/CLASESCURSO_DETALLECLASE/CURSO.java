
package CLASESCURSO_DETALLECLASE;

import CLASES_HUMANO.DOCENTE;

public class CURSO {
    
    DOCENTE docente;
    private String nombrecurso;

    public CURSO(DOCENTE docente, String nombrecurso) {
        this.docente = docente;
        this.nombrecurso = nombrecurso;
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
    
    
    
    
    
    
}
