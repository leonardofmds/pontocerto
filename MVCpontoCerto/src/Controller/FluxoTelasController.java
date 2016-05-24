/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;

/**
 *
 * @author Leonardo
 */
public class FluxoTelasController 
{
    public static HomeView hv = new HomeView();
    public static EnviarMaterialView emv = new EnviarMaterialView();
    public static DenunciarView dv = new DenunciarView();
    public static ControleNotaView cnv = new ControleNotaView();
    public static ControleFavoritosView cfv = new ControleFavoritosView();
    public static ControleDisciplinaView cdv = new ControleDisciplinaView(); 
    
    public FluxoTelasController()
    {

    }
    
    public static void main(String[] args) {
//        // TODO code application logic here
//        ftc = new FluxoTelasController(); 
        hv.setVisible(true);
    }
        
   
}
