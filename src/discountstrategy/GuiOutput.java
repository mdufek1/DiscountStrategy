/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

import javax.swing.JOptionPane;

/**
 *This class is a swing GUI output
 * @author Mike
 */
public class GuiOutput implements DisplayStrategy{

    @Override
    public void outputReciept(String message) {  
      if(message == null || message.isEmpty()){
        throw new IllegalArgumentException("message must be a valid string");
      }
      JOptionPane.showMessageDialog(null, message);
   
    }
    
}
