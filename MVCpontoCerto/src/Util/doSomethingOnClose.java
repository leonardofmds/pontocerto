/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Controller.FluxoTelasController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author labccet
 */
public class doSomethingOnClose 
{
    public static void newWindowEvent(JFrame j)
    {
        j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        j.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent evt) {
          onExit(j);
        }
       });
    }
    
    public static void onExit(JFrame j)
    {
        j.setVisible(false);
        FluxoTelasController.getHv().setVisible(true);
        switch(j.getClass().getName())
        {
            //case "View.FavoritosView" : FluxoTelasController.getCfv().Reseta();
            case "View.AddDisciplinaView" : FluxoTelasController.getAdv().Reseta();
            case "View.AddMaterialView" : FluxoTelasController.getAmv().Reseta();
            case "View.DenunciarView" : FluxoTelasController.getDv().Reseta();
            case "View.EnviarMaterialView" : FluxoTelasController.getEmv().Reseta();
            case "View.FavoritosView" : FluxoTelasController.getCfv().Reseta();
            case "View.LoginView" : FluxoTelasController.getLgv().Reseta();
            //case View.NotaView : FluxoTelasController.getCnv().
        }
    }    
}
