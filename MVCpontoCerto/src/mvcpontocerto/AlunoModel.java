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
public class AlunoModel 
{
    private String name, matricula;
    
    AlunoModel(String name, String matricula)
    {
        this.name = name;
        this.matricula = matricula;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public boolean EstaNomeado(){
        if(getNome()!= null)
            return true;
        else
            return false;
    }
}
