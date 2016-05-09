/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpontocerto;

/**
 *
 * @author Leonardo
 */
public class DisciplinaModel 
{
    private String nome, professor;
    private boolean favorito;
    private NotaModel[] notas;  

    public DisciplinaModel(String nome, String professor, boolean favorito, NotaModel[] notas) {
        this.nome = nome;
        this.professor = professor;
        this.favorito = favorito;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
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
