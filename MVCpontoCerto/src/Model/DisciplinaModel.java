/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Util.XML;
import java.io.Serializable;

/**
 *
 * @author Leonardo
 */
public class DisciplinaModel implements Serializable
{
    private int iddisc = 0;
    private String nomeDisc = null;
    private double media = 0;
    private boolean favorito = false;
    private NotaModel[] notas = null;  

    public int getIddisc() {
        return iddisc;
    }

    public void setIddisc(int iddisc) {
        this.iddisc = iddisc;
    }


    public DisciplinaModel()
    {

    }
    
    
    public DisciplinaModel(String nomedisc, double media, boolean favorito, NotaModel[] notas) {
        this.nomeDisc = nomedisc;
        this.media = media;
        this.favorito = favorito;
        this.notas = notas;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomedisc) {
        this.nomeDisc = nomedisc;
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
    
    public void salvaDisciplina()
    {
        XML.writter(this, ("Disciplinas/"+this.hashCode()));
    }
        
}
