/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.AdmModel;
/**
 *
 * @author labccet
 */
public class AdmController {
    AdmModel adm;

    public AdmController() {
        adm = new AdmModel();        
    }
    
    
    
    public void Logado(String user, String senha){
            
        if(user.equals("adm") && senha.equals("admin")){
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
