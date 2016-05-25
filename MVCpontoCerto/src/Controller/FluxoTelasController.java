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
    public static NotaView cnv = new NotaView();
    public static FavoritosView cfv = new FavoritosView();
    public static DisciplinaView cdv = new DisciplinaView(); 
    
    public FluxoTelasController()
    {

    }
    
    public static void main(String[] args) {
//        // TODO code application logic here
//        ftc = new FluxoTelasController(); 
        hv.setVisible(true);
    }
        
   
}
