/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Leonardo
 */
public class NotaModel implements Serializable
{
    private double nota,nfinal,peso;
    private int idnota; 
    private String tipo;

    public NotaModel()
    {
        
    }
            
//    public NotaModel(String tipo, double nota, int peso, double nfinal, int idnota) {
//        this.tipo = tipo;
//        this.nota = nota;
//        this.peso = peso;
//        this.idnota = idnota;
//        this.nfinal = nfinal;        
//    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNfinal() {
        return nfinal;
    }

    public void setNfinal(double nfinal) {
        this.nfinal = nfinal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
