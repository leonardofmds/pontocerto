/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.MySQL_POST;
import javax.swing.DefaultListModel;

/**
 *
 * @author Leonardo
 */
public class Teste 
{
    Teste()
    {
    }
    
    public static void Run()
    {
        DefaultListModel lt = MySQL_POST.carregaListaDiscModel("SELECT * FROM DISCIPLINA");
        System.out.println(lt);
    }
}
