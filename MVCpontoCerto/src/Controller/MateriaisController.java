/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.Mail;
import javax.activation.FileDataSource;




/**
 *
 * @author labccet
 */
public class MateriaisController {
    
    public void EnviaMaterial(String disciplina, String tipo, String subtipo, String ano, String semestre, FileDataSource fds){
       
        Mail.main();
        Mail.enviar(disciplina, tipo, subtipo, ano, semestre, fds);                
    }  
    
    public void DenunciaMaterial(String mensagem, String disciplina, String tipo, String semestre){
        Mail.main();
        Mail.denuncia(mensagem, disciplina, tipo, semestre);
    }
}
