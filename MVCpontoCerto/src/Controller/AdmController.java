/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.AdmModel;
import Util.MySQL_POST;
/**
 *
 * @author labccet
 */
public class AdmController {
    AdmModel adm;
    String password = "admin";

    public AdmController() {
        adm = new AdmModel();        
        password = MySQL_POST.carregaListaDisc("SELECT SENHA FROM USUARIO WHERE NOME = 'ADM'").get(0).toString().trim();
    }
    
    
    
    public void Logado(String user, String senha){
            
        if(user.equals("adm") && senha.equals(password)){
            adm.SetLog(true);
            
            
        }
        else
            adm.SetLog(false);
    }
    
    public void Desloga(){
        adm.SetLog(false);
        ativaComponentsADM();
    }
    
    public void ativaComponentsADM()
    {
        if(adm.GetLog())
        {
            FluxoTelasController.getCfv().getAddBt().setVisible(true);
            FluxoTelasController.getCfv().getAddBt().setEnabled(true);
            FluxoTelasController.getCdv().getAddBt().setVisible(true);
            FluxoTelasController.getCdv().getAddBt().setEnabled(true);
            FluxoTelasController.getCdv().getRemBt().setVisible(true);
            FluxoTelasController.getCdv().getRemBt().setEnabled(true);
            FluxoTelasController.getHv().getAdmBt().setVisible(false);
            FluxoTelasController.getHv().getAdmBt().setEnabled(false);
            FluxoTelasController.getHv().getAdmoutBt().setVisible(true);
            FluxoTelasController.getHv().getAdmoutBt().setEnabled(true);
            
        }
        else{
            FluxoTelasController.getCfv().getAddBt().setVisible(false);
            FluxoTelasController.getCfv().getAddBt().setEnabled(false);
            FluxoTelasController.getCdv().getAddBt().setVisible(false);
            FluxoTelasController.getCdv().getAddBt().setEnabled(false);
            FluxoTelasController.getCdv().getRemBt().setVisible(false);
            FluxoTelasController.getCdv().getRemBt().setEnabled(false);
            FluxoTelasController.getHv().getAdmBt().setVisible(true);
            FluxoTelasController.getHv().getAdmBt().setEnabled(true);
            FluxoTelasController.getHv().getAdmoutBt().setVisible(false);
            FluxoTelasController.getHv().getAdmoutBt().setEnabled(false);
        }
    }
    
    public boolean getLog(){
        return adm.GetLog();
    }
}
