/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author suporte
 */
public class XML 
{
    public static void writter(Object o, String file)
    {
    try{
            XMLEncoder xmlEncoder = null;
                    try{
            xmlEncoder = new XMLEncoder(
                    new FileOutputStream(file+".xml"));
            xmlEncoder.writeObject(o);
            
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
