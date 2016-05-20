/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Leonardo
 */
public class NotaModel 
{
    private double nota,nfinal;
    private int peso; 
    private String tipo;

    public NotaModel(String tipo, double nota, int peso, double nfinal) {
        this.tipo = tipo;
        this.nota = nota;
        this.peso = peso;
        this.nfinal = nfinal;        
    };

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double getNFinal() {
        return nfinal;
    }

    public void setNFinal(double nfinal) {
             
        double nota = getNota();
        int peso = getPeso();
        
        nfinal = nota*(peso/10);
        
        this.nfinal = nfinal;
    }
    

}
