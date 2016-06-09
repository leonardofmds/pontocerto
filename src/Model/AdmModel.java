/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author labccet
 */
public class AdmModel {
    
    private String login, senha;
    
    public AdmModel(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public String GetLogin(){
        return login;
    }
    
    public void SetLogin(String login){
        this.login = login;
    }
    
    public String GetSenha(){
        return senha;
    }
    
    public void SetSenha(String senha){
        this.senha = senha;
    }
    
}
