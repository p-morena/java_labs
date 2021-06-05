/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exclab3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */



public class ExcLab3 {

    
     private class Input{
      int num;
      public Input(int num) {
            this.num = num;}
       

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    
       void consInput(){
        String string_b = JOptionPane.showInputDialog("Введите начало");
          int num = Integer.parseInt(string_b);
        JOptionPane.showMessageDialog(null, "Число"+num);
            
        
        }
        
        
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
       // Input inp = new Input();
            }
    
}
