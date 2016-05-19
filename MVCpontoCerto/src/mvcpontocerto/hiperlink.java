/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpontocerto;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
/**
 *
 * @author labccet
 */
public class hiperlink {
    
     public void main(String[] args) throws URISyntaxException {
    URI uri = new URI("http://java.sun.com");
    class OpenUrlAction implements ActionListener {
      @Override public void actionPerformed(ActionEvent e) {
        open(uri);
      }
    }
  
  }

  public void open(URI uri) {
    if (Desktop.isDesktopSupported()) {
      try {
        Desktop.getDesktop().browse(uri);
      } catch (IOException e) { /* TODO: error handling */ }
    } else { /* TODO: error handling */ }
  }
    
    
    
}
