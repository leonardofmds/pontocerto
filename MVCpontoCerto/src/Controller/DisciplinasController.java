/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Leonardo
 */
public class DisciplinasController 
{
    DisciplinaModel disciplinas[];
    int nDisc;
    String [] t = null;
    
    public DisciplinasController() 
    {
        saveListNomeFavoritos();
        leDisciplinas();
        disciplinas = new DisciplinaModel[nDisc];
        for(int i = 0; i<nDisc;i++)
        {
            disciplinas[i] = new DisciplinaModel();
            disciplinas[i].setNomeDisc(t[i]);
        }
    }
    
    public DisciplinaModel[] getDisciplinas()
    {
        return disciplinas;
    }
    
    void leDisciplinas()
    {
        try{
            XMLDecoder xmlDecoder = null;
            try{
                xmlDecoder = new XMLDecoder(
                        new FileInputStream("Favoritos.xml"));
                t = (String[]) xmlDecoder.readObject();   
            } finally{
                if(xmlDecoder != null)
                    xmlDecoder.close();
            }
        } catch(IOException e)
        {
            System.out.println(e.getMessage());
        } 
        
        nDisc = t.length;
    }
    
    public void saveListNomeFavoritos()
    {
        String[] strings = { "Administração Financeira", "Álgebra Linear", "Análise de Algoritmo", "Análise de Sistemas", "Análise Empresarial e Admin.", "Banco de Dados I", "Banco de Dados II", "Cálculo Diferenc. e Integral I", "Cálculo Diferenc. e Integral II", "Desenvolv. de Páginas Web", "Empreendedorismo", "Estatística", "Estruturas de Dados I", "Estruturas de Dados II", "Estruturas Discretas", "Fund. de Sist. de Informação", "Gerência de Proj. de Informat.", "Interação Humano Computador", "Introdução à Lógica Computac.", "Linguag. Formais e Autômatos", "Matemática Básica", "Organização de Computadores", "Probabilidade", "Processos de Software", "Programação Modular", "Projeto de Graduação I", "Projeto de Graduação II", "Proj. e Const. de Sistemas", "Proj. Const. Sistemas-SGBD", "Redes de Computadores I", "Redes de Computadores II", "Sistemas Operacionais", "Técnicas de Programação I", "Técnicas de Programação II", "Teorias e Práticas Discursivas", "Administ. de Banco de Dados", "Algoritmos p/ Prob. Combinat.", "Ambiente Operacional Unix", "Compiladores", "Computação Gráfica", "Comunic. e Segurança de Dados", "Desenvolv. de Servidor Web", "Fluxos em Redes", "Fund. Repr. Conh. e Raciocínio", "Gerência de Dados em Amb. Distribuídos e Paralelos", "Gest. de Processos de Negócios", "Informática na Educação", "Inteligéncia Artificial", "Programação Linear", "Sistemas Colaborativos", "Sistemas Multimídia", "Tóp. Avançados em Algoritmos", "Tóp. Avançados em BD I", "Tóp. Avançados em BD II", "Tóp. Avançados em BD III", "Tóp. Avançados em Eng. Sw. I", "Tóp. Avançados em Eng. Sw. II", "Tóp. Avan. em Redes de Comp. I", "Tóp. Avan. em Redes de Comp. II", "Tóp. Avan. em Redes de Comp. III" };

        
        
                try{
            XMLEncoder xmlEncoder = null;
                    try{
            xmlEncoder = new XMLEncoder(
                    new FileOutputStream("Favoritos.xml"));
            xmlEncoder.writeObject(strings);
            
        }
                    finally{
                        if(xmlEncoder != null)
                        {
                            xmlEncoder.close();
                        }
                    }
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
