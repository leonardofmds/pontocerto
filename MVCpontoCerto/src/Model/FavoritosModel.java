/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.DefaultListModel;

/**
 *
 * @author Leonardo
 */
public class FavoritosModel implements Serializable
{
    DefaultListModel<String> nomeFavoritos = new DefaultListModel<>();
    String t;
    public FavoritosModel()
    {
        try{
            XMLDecoder xmlDecoder = null;
            try{
                xmlDecoder = new XMLDecoder(
                        new FileInputStream("Favoritos.xml"));
                t = (String) xmlDecoder.readObject();
                StringBuilder sb = new StringBuilder(t);
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length()-1);
                t = sb.toString();
                String tA[] = t.split(",");
                for(int i = 0; i<tA.length;i++)
                    nomeFavoritos.addElement(tA[i]);      
            } finally{
                if(xmlDecoder != null)
                    xmlDecoder.close();
            }
        } catch(IOException e)
        {
            System.out.println(e.getMessage());
        } 
    }
    
    FavoritosModel(DefaultListModel<String> nomeFavoritos)
    {
        this.nomeFavoritos = nomeFavoritos;
    }

    public DefaultListModel<String> getNomeFavoritos() {
        return nomeFavoritos;
    }

    public void setNomeFavoritos(DefaultListModel<String> nomeFavoritos) {
        this.nomeFavoritos = nomeFavoritos;
    }
    
    public void saveListNomeFavoritos()
    {
                try{
            XMLEncoder xmlEncoder = null;
                    try{
            xmlEncoder = new XMLEncoder(
                    new FileOutputStream("Favoritos.xml"));
            xmlEncoder.writeObject(nomeFavoritos.toString());
            
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
