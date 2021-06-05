/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        
         String string_x = JOptionPane.showInputDialog("Введите число");
          x = Double.parseDouble(string_x);
          
          for(int i=0; i<=10; i++){
       double y = Math.log(x-1);
       JOptionPane.showMessageDialog(null,"y= "+y);
    }
    
}
}