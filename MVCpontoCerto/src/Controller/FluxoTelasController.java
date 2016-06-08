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
    public static HomeView hv = new HomeView();
    public static EnviarMaterialView emv = new EnviarMaterialView();
    public static DenunciarView dv = new DenunciarView();
    public static NotaView cnv = new NotaView();
    public static FavoritosView cfv = new FavoritosView();
    public static DisciplinaView cdv = new DisciplinaView();
    
    public static DisciplinasController2 dc2 = new DisciplinasController2();
    public static NotasController nc = new NotasController();
    public static DisciplinasController dc = new DisciplinasController();
    
    public FluxoTelasController()
    {
        
    }
    
    public static void main(String[] args) {
//        // TODO code application logic here
//        ftc = new FluxoTelasController(); 
        hv.setVisible(true);
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
        
    
    public DisciplinasController2 getDisciplina2() {
        return dc2;
    }

    public void setDisciplina2(DisciplinasController2 dc2) {
        this.dc2 = dc2;
    }
    
    public DisciplinasController getDisciplina() {
        return dc;
    }

    public void setDisciplina2(DisciplinasController dc) {
        this.dc = dc;
    }
    
    public NotasController getNotas() {
        return nc;
    }

    public void setNotas(NotasController nc) {
        this.nc = nc;
    }
   
}
