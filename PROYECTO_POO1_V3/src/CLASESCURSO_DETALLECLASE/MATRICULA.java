
package CLASESCURSO_DETALLECLASE;

import CLASES_HUMANO.ALUMNO;


public class MATRICULA {
    
    
    ALUMNO alumno;
    CURSO curso;
    
    private String codigomatricula;
    
    private String ciclorelativo;
    private int creditos;
    private double pp;
    private double ep;
    private double ef;
    private double notafinal;
    private String estado;

    public MATRICULA() {
    }

    public MATRICULA(ALUMNO alumno, CURSO curso, String ciclorelativo, int creditos, double pp, double ep, double ef, double notafinal, String estado) {
        this.alumno = alumno;
        this.curso = curso;
        this.ciclorelativo = ciclorelativo;
        this.creditos = creditos;
        this.pp = pp;
        this.ep = ep;
        this.ef = ef;
        this.notafinal = notafinal;
        this.estado = estado;
    }

    public ALUMNO getAlumno() {
        return alumno;
    }

    public void setAlumno(ALUMNO alumno) {
        this.alumno = alumno;
    }

    public CURSO getCurso() {
        return curso;
    }

    public void setCurso(CURSO curso) {
        this.curso = curso;
    }

    public String getCiclorelativo() {
        return ciclorelativo;
    }

    public void setCiclorelativo(String ciclorelativo) {
        this.ciclorelativo = ciclorelativo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }

    public double getEp() {
        return ep;
    }

    public void setEp(double ep) {
        this.ep = ep;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public double getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
