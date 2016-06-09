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
import Controller.*;

/**
 *
 * @author Leonardo
 */
public class FluxoTelasController 
{
    private static DisciplinasController2 dc2 = new DisciplinasController2();
    //private static DisciplinasController dc = new DisciplinasController();
    
    private static HomeView hv = new HomeView();
    private static EnviarMaterialView emv = new EnviarMaterialView();
    private static DenunciarView dv = new DenunciarView();
    private static NotaView cnv = new NotaView();
    private static FavoritosView cfv = new FavoritosView();
    private static DisciplinaView cdv = new DisciplinaView();
    

    
    public FluxoTelasController()
    {
        
    }

    public static HomeView getHv() {
        return hv;
    }

    public static EnviarMaterialView getEmv() {
        return emv;
    }

    public static DenunciarView getDv() {
        return dv;
    }

    public static NotaView getCnv() {
        return cnv;
    }

    public static FavoritosView getCfv() {
        return cfv;
    }

    public static DisciplinaView getCdv() {
        return cdv;
    }

    public static DisciplinasController2 getDc2() {
        return dc2;
    }

//    public static DisciplinasController getDc() {
//        return dc;
//    }
    
    
    
    public static void main(String[] args) {
//        // TODO code application logic here
//        ftc = new FluxoTelasController(); 
        hv.setVisible(true);
//        DisciplinaModel dm = new DisciplinaModel();
//        dm.setIddisc(24);
//        dm.setNomeDisc("Projeto e Construção de Sistemas");
//        dm.setMedia(10);
//        dm.setFavorito(true);
//        NotaModel nm[] = new NotaModel[10];
//        for(int i = 0; i< nm.length; i++) {nm[i] = new NotaModel();nm[i].setNota(i);}
//        dm.setNotas(nm);
//        XML.writter(dm, dm.getNomeDisc());
        
    }
        
   
}
