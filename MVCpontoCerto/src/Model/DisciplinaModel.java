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
public class DisciplinaModel 
{
    private int iddisc = 0;
    private String nomedisc = null;
    private double media = 0;
    private boolean favorito = false;
    private NotaModel[] notas = null;  

    public DisciplinaModel()
    {
        
    }
    
    public DisciplinaModel(String nomedisc, double media, boolean favorito, NotaModel[] notas) {
        this.nomedisc = nomedisc;
        this.media = media;
        this.favorito = favorito;
        this.notas = notas;
    }

    public String getNomeDisc() {
        return nomedisc;
    }

    public void setNomeDisc(String nomedisc) {
        this.nomedisc = nomedisc;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public NotaModel[] getNotas() {
        return notas;
    }

    public void setNotas(NotaModel[] notas) {
        this.notas = notas;
    }
        
}
