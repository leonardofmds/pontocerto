/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.net.URL;

/**
 *
 * @author labccet
 */
public class MateriaisModel {
    
    private int idmat, ano, semestre;
    private String tipo, subtipo;
    private DisciplinaModel[] disciplina;
    private URL conteudo, link;
    
    public MateriaisModel(int idmat, int ano, int semestre, String tipo, String subtipo /*URL conteudo, URL link*/, DisciplinaModel[] disciplina){
        this.idmat = idmat;
        this.ano = ano;
        this.semestre = semestre;
        this.tipo = tipo;
        this.subtipo = subtipo;
        //this.conteudo = conteudo;
        //this.link = link;
        this.disciplina = disciplina;
    }
    
    public int GetIdMat(){
        return idmat;
    } 
    
    public void SetIdMat(int idmat){
        this.idmat = idmat;
    }
    
    public int GetAno(){
        return ano;
    } 
    
    public void SetAno(int ano){
        this.ano = ano;
    }
    
    public int GetSemestre(){
        return semestre;
    } 
    
    public void SetSemestre(int semestre){
        this.semestre = semestre;
    }
    
    public String GetTipo(){
        return tipo;
    } 
    
    public void SetTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String GetSubTipo(){
        return subtipo;
    } 
    
    public void SetSubTipo(String subtipo){
        this.subtipo = subtipo;
    }
    
    public DisciplinaModel[] GetDisciplina(){
        return disciplina;
    } 
    
    public void SetDisciplina(DisciplinaModel[] disciplina){
        this.disciplina = disciplina;
    }
}
