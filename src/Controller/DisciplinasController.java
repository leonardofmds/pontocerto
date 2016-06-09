/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import Util.MySQL_POST;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import Util.XML;
import java.util.Arrays;

/**
 *
 * @author Leonardo
 */
public class DisciplinasController 
{
    DisciplinaModel disciplinas[];
    int nDisc;
    String [] d,f = null;
    
    public DisciplinasController() 
    {
        //saveListNomeFavoritos();
        //MySQL_POST.carregaListaDisc("select nome from disciplina");
        leDisciplinas();
        leFavoritos();
        
        //d = MySQL_POST.carregaListaDisc("select nome from disciplina").getItems();
        disciplinas = new DisciplinaModel[nDisc];
        for(int i = 0; i<d.length;i++)
        {
            disciplinas[i] = new DisciplinaModel();
            disciplinas[i].setNomeDisc(d[i]);
            disciplinas[i].setFavorito(false);
        }
        int fCont = 0;
        for(int i = d.length; i<(d.length+f.length);i++)
        {
            disciplinas[i] = new DisciplinaModel();
            disciplinas[i].setNomeDisc(f[fCont]);
            disciplinas[i].setFavorito(true);
            fCont++;
        }
    }
    
    public DisciplinaModel[] getDisciplinas()
    {
        return disciplinas;
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
    
    public void escreveArquivos()
    {
        ListModel<String> listaDisc = listaDisciplinas();
        ListModel<String> listaFav = listaFavoritos();
              
        String[] vDisc = new String[listaDisc.getSize()];
        String[] vFav = new String[listaFav.getSize()];
        
        for(int i = 0; i < listaDisc.getSize(); i++) vDisc[i] = listaDisc.getElementAt(i);
        for(int i = 0; i < listaFav.getSize(); i++) vFav[i] = listaFav.getElementAt(i);
        
        XML.writter(vDisc, "Disciplinas");
        XML.writter(vFav, "Favoritos");
    }
    private void leDisciplinas()
    {
        d = (String[])XML.reader("Disciplinas");
        
        nDisc = nDisc + d.length;
    }
    private void leFavoritos()
    {
       f = (String[])XML.reader("Favoritos");
        
        nDisc = nDisc + f.length;
    }
    
    public void saveListNomeFavoritos()
    {
        String[] strings = { "Administração Financeira", "Álgebra Linear", "Análise de Algoritmo", "Análise de Sistemas", "Análise Empresarial e Admin.", "Banco de Dados I", "Banco de Dados II", "Cálculo Diferenc. e Integral I", "Cálculo Diferenc. e Integral II", "Desenvolv. de Páginas Web", "Empreendedorismo", "Estatística", "Estruturas de Dados I", "Estruturas de Dados II", "Estruturas Discretas", "Fund. de Sist. de Informação", "Gerência de Proj. de Informat.", "Interação Humano Computador", "Introdução à Lógica Computac.", "Linguag. Formais e Autômatos", "Matemática Básica", "Organização de Computadores", "Probabilidade", "Processos de Software", "Programação Modular", "Projeto de Graduação I", "Projeto de Graduação II", "Proj. e Const. de Sistemas", "Proj. Const. Sistemas-SGBD", "Redes de Computadores I", "Redes de Computadores II", "Sistemas Operacionais", "Técnicas de Programação I", "Técnicas de Programação II", "Teorias e Práticas Discursivas", "Administ. de Banco de Dados", "Algoritmos p/ Prob. Combinat.", "Ambiente Operacional Unix", "Compiladores", "Computação Gráfica", "Comunic. e Segurança de Dados", "Desenvolv. de Servidor Web", "Fluxos em Redes", "Fund. Repr. Conh. e Raciocínio", "Gerência de Dados em Amb. Distribuídos e Paralelos", "Gest. de Processos de Negócios", "Informática na Educação", "Inteligéncia Artificial", "Programação Linear", "Sistemas Colaborativos", "Sistemas Multimídia", "Tóp. Avançados em Algoritmos", "Tóp. Avançados em BD I", "Tóp. Avançados em BD II", "Tóp. Avançados em BD III", "Tóp. Avançados em Eng. Sw. I", "Tóp. Avançados em Eng. Sw. II", "Tóp. Avan. em Redes de Comp. I", "Tóp. Avan. em Redes de Comp. II", "Tóp. Avan. em Redes de Comp. III" };
        
        XML.writter(strings, "Disciplinas");
    }
    
}
