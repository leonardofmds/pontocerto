/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.Mail;
import java.io.File;



/**
 *
 * @author labccet
 */
public class MateriaisController {
    
    public void EnviaMaterial(String disciplina, String tipo, String subtipo, String ano, String semestre){
                Mail.main(disciplina, tipo, subtipo, ano, semestre);                
    }   
}
