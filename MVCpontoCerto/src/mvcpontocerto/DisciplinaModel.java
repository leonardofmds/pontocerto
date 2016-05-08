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
    private String nome;
    private NotaModel nota[];
    
    DisciplinaModel(String nome,int n)
    {
        this.nome = nome;
        nota = new NotaModel[n];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NotaModel[] getNota() {
        return nota;
    }

    public void setNota(NotaModel[] nota) {
        this.nota = nota;
    }
}
