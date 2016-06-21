/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DisciplinaModel;
import Util.MySQL_POST;
import Util.XML;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Leonardo
 */
public class DisciplinasController2 
{
        DisciplinaModel disciplinas[];
        String d[];

    public DisciplinasController2() 
    {
        carregaDisciplinas();
        serializaDisciplinas();
    }
    
    public void serializaDisciplinas()
    {
//        for(int i = 0;i< disciplinas.length;i++)
//        {
//            //disciplinas[i].salvaDisciplina();
//        }       
        XML.writter(disciplinas, "Disciplinas/Disciplinas");
        }
    
    public void carregaDisciplinas()
    {
        //Object o = XML.reader("Projeto e Construção de Sistemas");
        
        
//        d = MySQL_POST.carregaListaDisc("select nome from disciplina").getItems();
//        //String id[] = MySQL_POST.carregaListaDisc("select id from disciplina").getItems();
//        disciplinas = new DisciplinaModel[d.length];
//        for(int i = 0; i< d.length; i++)
//        {
//            disciplinas[i] = new DisciplinaModel();
//            disciplinas[i].setNomeDisc(d[i]);
//            disciplinas[i].setFavorito(false);
//        }
        
        disciplinas = (DisciplinaModel[])XML.reader("Disciplinas/Disciplinas");
        
        
        
    }
    
    public DefaultListModel<String> listaDisciplinas()
    {
        DefaultListModel<String> ltModel = new DefaultListModel<String>();
        
        for(int i = 0; i< disciplinas.length;i++)
        {
            if(disciplinas[i].isFavorito()==false)
                ltModel.addElement(disciplinas[i].getNomeDisc());
        }
        //System.out.println(ltModel);
        return ltModel;

    }
    
    public DefaultListModel<String> listaFavoritos()
    {
        DefaultListModel<String> ltModel = new DefaultListModel<String>();
        
        for(int i = 0; i< disciplinas.length;i++)
        {
            if(disciplinas[i].isFavorito())
                ltModel.addElement(disciplinas[i].getNomeDisc());
        }
        System.out.println(ltModel);
        return ltModel;
    }
        
    public void setFavoritos(ListModel<String> lt)
    {
        String s[] = new String[lt.getSize()];
        if(lt.getSize()==0)
        {
            for(int i = 0; i < disciplinas.length; i++) disciplinas[i].setFavorito(false);
        }
        for(int i = 0; i < lt.getSize(); i++) s[i] = lt.getElementAt(i);
        
        for(int i = 0; i< disciplinas.length;i++)
        {
            for(int j = 0; j< s.length;j++)
            {
                if(disciplinas[i].getNomeDisc().equals(s[j]))
                {
                    disciplinas[i].setFavorito(true);
                    break;
                }
                else
                    disciplinas[i].setFavorito(false);
            }
        }
    }
    
    public DisciplinaModel[] getDisciplinas() 
    {
        return disciplinas;
    }
    
    public DisciplinaModel getDisciplinasEspecifica(String nome) 
    {
        for(int i = 0; i< disciplinas.length; i++)
        {
            if(disciplinas[i].getNomeDisc().equals(nome))
            {
                return disciplinas[i];
            }
        }
        return null;
    }

    public void setDisciplinas(DisciplinaModel[] disciplinas) 
    {
        this.disciplinas = disciplinas;
    }
    
    public DefaultComboBoxModel<String> comboDisciplinas()
    {
        DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel<String>();
        
        for(int i = 0; i< disciplinas.length;i++)
        {            
             cbModel.addElement(disciplinas[i].getNomeDisc());
        }
        
        //System.out.println(ltModel);
        return cbModel;

    }
           
}
