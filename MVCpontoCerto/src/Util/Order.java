/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Arrays;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author suporte
 */
public class Order 
{
    public static ListModel<String> ordenaListModel(DefaultListModel<String> lt)
    {        
        String [] s = new String[lt.getSize()];
        
        for(int i = 0; i < lt.getSize();i++){s[i] = lt.getElementAt(i);}
        Arrays.sort(s);
        for(int i = 0; i < lt.getSize();i++){lt.setElementAt(s[i],i);}
        System.out.println("teste");
        return lt;
        
    }
    public static ComboBoxModel<String> ordenaComboModel(DefaultComboBoxModel<String> cb)
    {        
       String [] s = new String[cb.getSize()];
        
        
       for(int i = 0; i < cb.getSize();i++)
            s[i] = cb.getElementAt(i);
       
       Arrays.sort(s);      
       
       for(int i = 0; i < cb.getSize();i++)
       {
           cb.removeElementAt(i);
           cb.insertElementAt(s[i], i);
       }      
       
        
        return cb;     
        
    }
}
