/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DisciplinaModel;
import Model.NotaModel;
import Util.XML;
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
        //hv.setVisible(true);
        DisciplinaModel dm = new DisciplinaModel();
        dm.setIddisc(24);
        dm.setNomeDisc("PCS");
        dm.setMedia(10);
        dm.setFavorito(true);
        NotaModel nm[] = new NotaModel[10];
        for(int i = 0; i< nm.length; i++) {nm[i] = new NotaModel();nm[i].setNota(i);}
        dm.setNotas(nm);
        XML.writter(dm, ("Disciplinas/xxx"));
        
    }
        
   
}
