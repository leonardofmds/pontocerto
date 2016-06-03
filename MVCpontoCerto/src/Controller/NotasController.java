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
import javax.swing.table.TableModel;

/**
 *
 * @author labccet
 */
public class NotasController {
    NotaModel notas[];
    
    public double CalculaNotaPeso(double nota, double peso){
        double notapeso;
        
        notapeso = nota*(peso/10);
        
        return notapeso;
    }
    public void escreveArquivos(){
        
    }
    public void leNotas(){
        
    }
    public void saveTableNotas(){
        
    }
}

